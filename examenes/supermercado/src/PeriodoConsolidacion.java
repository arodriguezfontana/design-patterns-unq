public class PeriodoConsolidacion implements Periodo {

    @Override
    public void realizarPago(Cliente cliente, Compra compra) {
        if (cliente.getCupones() <= 3 && compra.getMonto() > 50000.0) {
            cliente.usarCupon();
            compra.aplicarDescuento(0.40);
        } else {
            cliente.cambiarPeriodo(new PeriodoFidelizacion());
        }
    }

    @Override
    public boolean estaFidelizado() {
        return false;
    }
}
