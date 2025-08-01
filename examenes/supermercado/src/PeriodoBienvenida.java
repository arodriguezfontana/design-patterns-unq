public class PeriodoBienvenida implements Periodo {

    @Override
    public void realizarPago(Cliente cliente, Compra compra) {
        if (cliente.cantidadDeCompras() <= 10) {
            compra.aplicarDescuento(0.15);
        } else {
            cliente.obtenerCupones(3);
            cliente.cambiarPeriodo(new PeriodoConsolidacion());
        }
    }

    @Override
    public boolean estaFidelizado() {
        return false;
    }
}
