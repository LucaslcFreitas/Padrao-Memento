public class ProcessoEstadoRegistrado implements ProcessoEstado{

    private ProcessoEstadoRegistrado() {};
    private static ProcessoEstadoRegistrado instance = new ProcessoEstadoRegistrado();
    public static ProcessoEstadoRegistrado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Registrado";
    }
}
