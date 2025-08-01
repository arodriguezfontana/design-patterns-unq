import java.util.*;

public class Proyecto implements Actividad{
    private List<Actividad> actividades;

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public void eliminarActividad(Actividad actividad) {
        actividades.remove(actividad);
    }

    @Override
    public Double total() {
        Double costoActividades = actividades.stream()
                .mapToDouble(a -> a.total())
                .sum();

        return costoActividades * 1.20;
    }

    @Override
    public Double ajustePorFormaDePago(EstrategiaFormaPago formaDePago) {
        return actividades.stream()
                .mapToDouble(a -> a.ajustePorFormaDePago(formaDePago))
                .sum();
    }
}
