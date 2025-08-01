import java.time.LocalDate;
import java.util.*;

public class Cliente {
    private Periodo periodo;
    private Integer cupones;
    private List<Compra> compras;
    private String mail;

    public Cliente(String mail) {
        this.periodo = new PeriodoBienvenida();
        this.cupones = 0;
        this.compras = new ArrayList<>();
        this.mail = mail;
    }

    public void cambiarPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public int cantidadDeCompras() {
        return compras.size();
    }

    public double montoGastado() {
        return compras.stream()
                .mapToDouble(compra -> compra.montoFinal(compra.getMonto(), compra.getDescuento()))
                .sum();
    }

    public boolean estaFidelizado() {
        return periodo.estaFidelizado();
    }

    public void usarCupon() {
        cupones --;
    }

    public void obtenerCupones(int cantidadCupones) {
        this.cupones = cantidadCupones;
    }

    public LocalDate fechaUltimaCompra() {
        return compras.getLast().getFecha();
    }

    public void realizarCompra(Compra compra) {
        periodo.realizarPago(this, compra);
        agregarCompra(compra);
    }

    public Integer getCupones() { return cupones; }

    public List<Compra> getCompras() {
        return compras;
    }

    public String getMail() {
        return mail;
    }
}
