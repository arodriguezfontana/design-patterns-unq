public class EstadoVigente implements EstadoPoliza {
    @Override
    public void agregarItem(Poliza poliza, Item item) {
        poliza.cancelar();
    }

    @Override
    public void cerrarInventario(Poliza poliza) {
    }

    @Override
    public void pagar(Poliza poliza) {
    }

    @Override
    public void cancelar(Poliza poliza) {
        poliza.eliminarTodosLosGastosAdministrativos();
        poliza.setEstado(new EstadoAbierto());
    }

    @Override
    public void aplicarDescuento(Poliza poliza) {
        poliza.eliminarTodosLosGastosAdministrativos();
    }
}
