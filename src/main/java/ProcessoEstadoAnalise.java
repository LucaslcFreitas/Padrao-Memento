public class ProcessoEstadoAnalise implements ProcessoEstado{

    private ProcessoEstadoAnalise() {};
    private static ProcessoEstadoAnalise instance = new ProcessoEstadoAnalise();
    public static ProcessoEstadoAnalise getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Análise";
    }
}
