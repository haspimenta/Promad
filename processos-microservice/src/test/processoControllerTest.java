package com.example.processos;

import com.example.processos.model.processo;
import com.example.processos.repository.processoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class processoControllerTest {

    @Mock
    private processoRepository processoRepository;

    @InjectMocks
    private processoController processoController;

    @Test
    public void testCriarProcessoDuplicado() {
        processo processo = new Processo();
        processo.setNumeroProcesso("12345");

        when(processoRepository.findByNumeroProcesso("12345")).thenReturn(Optional.of(processo));

        ResponseEntity<?> response = processoController.criarProcesso(processo);

        assertEquals(400, response.getStatusCodeValue());
    }
}

