import java.util.*;

public class SecretariaDeInfraestructura {

    private List<Obra> obras;

    public Double inversionTotal() {
        return obras.stream()
                .mapToDouble(obra -> obra.inversionTotal())
                .sum();
    }

}
