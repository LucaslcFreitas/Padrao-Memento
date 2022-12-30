public class ProcessoEstadoConcluido implements ProcessoEstado{

    private ProcessoEstadoConcluido() {};
    private static ProcessoEstadoConcluido instance = new ProcessoEstadoConcluido();
    public static ProcessoEstadoConcluido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Concluido";
    }
}
