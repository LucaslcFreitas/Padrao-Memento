import java.util.ArrayList;
import java.util.List;

public class Processo {

    private ProcessoEstado estado;
    private List<ProcessoEstado> memento = new ArrayList<>();

    public ProcessoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ProcessoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restaurarEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() -1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ProcessoEstado> getEstados() {
        return this.memento;
    }
}
