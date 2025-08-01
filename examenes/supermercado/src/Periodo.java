public interface Periodo {

    boolean estaFidelizado();
    void realizarPago(Cliente cliente, Compra compra);
}
