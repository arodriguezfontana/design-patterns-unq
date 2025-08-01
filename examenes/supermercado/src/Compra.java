import java.time.*;

public class Compra {
    private LocalDate fecha;
    private Double monto;
    private String medioDePago;
    private Double descuento;

    public Compra(LocalDate fecha, Double monto, String medioDePago) {
        this.fecha = fecha;
        this.monto = monto;
        this.medioDePago = medioDePago;
        this.descuento = 0.0;
    }

    public void aplicarDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double montoFinal(Double monto, Double descuento) {
      return monto * descuento;
    };

    public Double getMonto() {
        return monto;
    }

    public Double getDescuento() {
        return descuento;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
