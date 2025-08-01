import java.time.*;

public class PeriodoFidelizacion implements Periodo {
    private MailSender mailSender;

    @Override
    public void realizarPago(Cliente cliente, Compra compra) {
        LocalDate diaActual = LocalDate.now();
        if (cliente.fechaUltimaCompra() == diaActual.minusDays(1)) {
            mailSender.enviarMail(cliente.getMail(), "Gracias por elegirnos.", "Gracias por permanecer con nosotros.");
        }
    }

    @Override
    public boolean estaFidelizado() {
        return true;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }
}