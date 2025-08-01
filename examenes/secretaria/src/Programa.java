import java.time.*;
import java.util.*;

public class Programa extends Obra {

    private List<Obra> obras;
    private Double costoFijoGestion;

    public Programa(String nombre, LocalDate fechaDeInicio, Empleado lider, Double costoFijoGestion) {
        super(nombre, fechaDeInicio, lider);
        this.obras = new ArrayList<Obra>();
        this.costoFijoGestion = costoFijoGestion;
    }

    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public void eliminarObra(Obra obra) {
        obras.remove(obra);
    }

    @Override
    public LocalDate getFechaDeInicio() {
        return obras.stream()
                .map(obra -> obra.getFechaDeInicio())
                .min((f1, f2) -> f1.compareTo(f2))
                .get();
    }

    @Override
    public Double inversionTotal() {
        return costoFijoGestion + sumatoriaTotalDeInversion();
    }

    public Double sumatoriaTotalDeInversion() {
        return obras.stream()
                .mapToDouble(obra -> obra.inversionTotal())
                .sum();
    }

}
