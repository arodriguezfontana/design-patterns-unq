import java.util.*;

public class EstrategiaPremioMonto implements EstrategiaPremio{

    @Override
    public Cliente elegirGanador(List<Cliente> clientes) {
        return clientes.stream()
                .max(Comparator.comparingDouble(cliente -> cliente.montoGastado()))
                .get();
    }
}
