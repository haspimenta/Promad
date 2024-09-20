package com.example.processos;

import com.example.processos.controller.usuarioController;
import com.example.processos.model.usuario;
import com.example.processos.repository.usuarioRepository;
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
public class usuarioControllerTest {

    @Mock
    private usuarioRepository usuarioRepository;

    @InjectMocks
    private usuarioController usuarioController;

    @Test
    public void testListarUsuarios() {
        usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNome("João");

        usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNome("Maria");

        List<usuario> mockUsuarios = Arrays.asList(usuario1, usuario2);

        when(usuarioRepository.findAll()).thenReturn(mockUsuarios);

        List<usuario> usuarios = usuarioController.listarUsuarios();

        assertEquals(2, usuarios.size());
        assertEquals("João", usuarios.get(0).getNome());
        assertEquals("Maria", usuarios.get(1).getNome());
    }
}
