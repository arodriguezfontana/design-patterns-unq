import java.util.*;

public class EstrategiaPremioCompras implements EstrategiaPremio {

    @Override
    public Cliente elegirGanador(List<Cliente> clientes) {
        return clientes.stream()
                .max(Comparator.comparingInt(cliente -> cliente.cantidadDeCompras()))
                .get();
    }
}
