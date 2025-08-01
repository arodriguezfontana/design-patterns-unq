public class EstadoCerrado implements EstadoPoliza {
    @Override
    public void agregarItem(Poliza poliza, Item item) {
        poliza.agregarAInventario(item);
        poliza.agregarGastoAdministrativo(new GastoAdministrativo("Recargo por extencion", 0.3));
    }

    @Override
    public void cerrarInventario(Poliza poliza) {
    }

    @Override
    public void pagar(Poliza poliza) {
        poliza.setEstado(new EstadoVigente());
    }

    @Override
    public void cancelar(Poliza poliza) {
    }

    @Override
    public void aplicarDescuento(Poliza poliza) {
        poliza.eliminarGastoAdministrativoDeMayorValor();
    }
}
