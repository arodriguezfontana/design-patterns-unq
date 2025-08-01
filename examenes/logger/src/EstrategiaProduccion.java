import java.util.*;

public class EstrategiaProduccion extends EstrategiaRegla{
    private Set<Severidad> nivelesSeveridad;

    @Override
    public void notificar(String mensaje, Severidad severidad, SistemaDeEscucha sistemaDeEscucha) {
        if (nivelesSeveridad.contains(severidad)) {
            sistemaDeEscucha.mostrarMensaje(mensaje, IMonitor.RED);
            sistemaDeEscucha.agregarMensaje(mensaje);
        }
    }

    public void setNivelesSeveridad(Set<Severidad> nivelesSeveridad) {
        this.nivelesSeveridad = nivelesSeveridad;
    }
}
