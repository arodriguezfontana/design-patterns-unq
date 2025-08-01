import java.util.*;

public class Logger {
    private List<SistemaDeEscucha> interesados;

    public void suscribirInteresado(SistemaDeEscucha sistemaDeEscucha) {
        interesados.add(sistemaDeEscucha);
    }

    public void desuscribirInteresado(SistemaDeEscucha sistemaDeEscucha) {
        interesados.remove(sistemaDeEscucha);
    }

    public void enviarNotifiacion(String mensaje, Severidad severidad) {
        interesados.stream()
                .forEach(i -> i.notificar(mensaje, severidad));
    }
}
