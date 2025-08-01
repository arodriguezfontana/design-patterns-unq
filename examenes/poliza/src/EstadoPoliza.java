public interface EstadoPoliza {
    void agregarItem(Poliza poliza, Item item);
    void cerrarInventario(Poliza poliza);
    void pagar(Poliza poliza);
    void cancelar(Poliza poliza);
    void aplicarDescuento(Poliza poliza);
}
