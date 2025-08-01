import java.time.*;
import java.util.*;

public class Proyecto extends Obra {

    private Integer duracionEnDias;
    private List<Empleado> empleados;

    public Proyecto(String nombre, LocalDate fechaInicio, Empleado lider, List<Empleado> empleados, Integer duracionEnDias) {
        super(nombre, fechaInicio, lider);
        this.empleados = new ArrayList<Empleado>();
        this.duracionEnDias = duracionEnDias;
    }

    @Override
    public Double inversionTotal() {
        return sueldosEmpleados() + sueldoLider();
    }

    public Double sueldosEmpleados() {
        Double sueldoDiarioEmpleados = empleados.stream()
                                        .mapToDouble(empleado -> empleado.sueldoDiario())
                                        .sum();

        return sueldoDiarioEmpleados * duracionEnDias;
    }

    public Double sueldoLider() {
        return getLider().sueldoDiario() * duracionEnDias * 1.30;
    }

}
