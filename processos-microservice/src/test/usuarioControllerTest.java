package com.example.microsservico;

import com.example.microsservico.controller.UsuarioController;
import com.example.microsservico.model.Usuario;
import com.example.microsservico.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UsuarioControllerTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioController usuarioController;

    @Test
    public void testListarUsuarios() {
        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNome("João");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNome("Maria");

        List<Usuario> mockUsuarios = Arrays.asList(usuario1, usuario2);

        when(usuarioRepository.findAll()).thenReturn(mockUsuarios);

        List<Usuario> usuarios = usuarioController.listarUsuarios();

        assertEquals(2, usuarios.size());
        assertEquals("João", usuarios.get(0).getNome());
        assertEquals("Maria", usuarios.get(1).getNome());
    }
}
