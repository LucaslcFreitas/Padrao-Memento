public class ProcessoEstadoPendente implements ProcessoEstado{

    private ProcessoEstadoPendente() {};
    private static ProcessoEstadoPendente instance = new ProcessoEstadoPendente();
    public static ProcessoEstadoPendente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pendente";
    }
}
