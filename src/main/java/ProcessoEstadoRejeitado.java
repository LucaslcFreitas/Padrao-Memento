public class ProcessoEstadoRejeitado implements ProcessoEstado{

    private ProcessoEstadoRejeitado() {};
    private static ProcessoEstadoRejeitado instance = new ProcessoEstadoRejeitado();
    public static ProcessoEstadoRejeitado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Rejeitado";
    }
}
