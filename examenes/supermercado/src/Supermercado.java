import java.util.*;

public class Supermercado{
    private List<Cliente> clientes;
    private EstrategiaPremio estrategia;

    public Supermercado(EstrategiaPremio estrategia) {
        this.clientes = new ArrayList<>();
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaPremio estrategia) {
        this.estrategia = estrategia;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Compra> comprasTotales() {
        return clientes.stream()
                .flatMap(cliente -> cliente.getCompras().stream())
                .toList();
    }

    public List<Cliente> clientesFidelizados() {
        return clientes.stream()
                .filter(cliente -> cliente.estaFidelizado())
                .toList();
    }

    public void entregarPremio() {
        estrategia.elegirGanador(clientesFidelizados());
    }

}
