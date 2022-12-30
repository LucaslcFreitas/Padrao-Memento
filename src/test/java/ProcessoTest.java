import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessoTest {

    @Test
    void deveArmazenarEstados() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertEquals(2, processo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        processo.restaurarEstado(0);
        assertEquals(ProcessoEstadoRegistrado.getInstance(), processo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        processo.restaurarEstado(3);
        assertEquals(ProcessoEstadoAnalise.getInstance(), processo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Processo processo = new Processo();
            processo.restaurarEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}