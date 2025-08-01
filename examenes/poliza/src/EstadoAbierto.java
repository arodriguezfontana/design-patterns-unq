public class EstadoAbierto implements EstadoPoliza {
    @Override
    public void agregarItem(Poliza poliza, Item item) {
        poliza.agregarAInventario(item);
    }

    @Override
    public void cerrarInventario(Poliza poliza) {
        poliza.setEstado(new EstadoCerrado());
    }

    @Override
    public void pagar(Poliza poliza) {
    }

    @Override
    public void cancelar(Poliza poliza) {
    }

    @Override
    public void aplicarDescuento(Poliza poliza) {
        poliza.agregarGastoAdministrativo(new GastoAdministrativo("Bonificacion Administrativa", -500.0));
    }
}
