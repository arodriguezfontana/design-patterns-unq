import java.time.*;

public abstract class Obra {
    private String nombre;
    private LocalDate fechaDeInicio;
    private Empleado lider;

    public Obra(String nombre, LocalDate fechaDeInicio, Empleado lider) {
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.lider = lider;
    }

    public Empleado getLider() {
        return lider;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public abstract Double inversionTotal();
}
