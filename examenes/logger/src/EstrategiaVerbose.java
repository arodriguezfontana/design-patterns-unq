public class EstrategiaVerbose extends EstrategiaRegla {
    private IEmailApp emailApp;

    @Override
    public void notificar(String mensaje, Severidad severidad, SistemaDeEscucha sistemaDeEscucha) {
        sistemaDeEscucha.mostrarMensaje(mensaje, IMonitor.GRAY);
        sistemaDeEscucha.agregarMensaje(mensaje);
        if (sistemaDeEscucha.cantidadMensajesEnviados() == 100) {
            emailApp.sendEmail(sistemaDeEscucha.getMail(), "100 mensajes enviados", sistemaDeEscucha.todosLosMensajes());
        }
    }
}
