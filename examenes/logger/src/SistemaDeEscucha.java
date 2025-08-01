import java.util.*;
import java.util.stream.*;

public class SistemaDeEscucha implements Interesado {
    private Monitor monitor;
    private EstrategiaRegla regla;
    private List<String> mensajesEnviados;
    private String mail;

    @Override
    public void notificar(String mensaje, Severidad severidad) {
        regla.notificar(mensaje, severidad, this);
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void mostrarMensaje(String mensaje, String color) {
        monitor.imprimirPantalla(mensaje, color);
    }

    public void agregarMensaje(String mensaje) {
        mensajesEnviados.add(mensaje);
    }

    public Integer cantidadMensajesEnviados() {
        return mensajesEnviados.size();
    }

    public void setRegla(EstrategiaRegla regla) {
        this.regla = regla;
    }

    public String getMail() {
        return mail;
    }

    public String todosLosMensajes() {
        return mensajesEnviados.stream()
                                    .collect(Collectors.joining(", "));
    }
}
