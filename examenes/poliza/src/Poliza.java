import java.util.*;

public class Poliza {
    private EstadoPoliza estado;
    private List<Item> inventario;
    private List<GastoAdministrativo> gastosAdministrativos;
    private String mailTitular;
    private BonificacionService bonificacionService;

    public Poliza(EstadoPoliza estado, String mailTitular, BonificacionService bonificacionService) {
        this.estado = estado;
        this.inventario = new ArrayList<Item>();
        this.gastosAdministrativos = new ArrayList<GastoAdministrativo>();
        this.mailTitular = mailTitular;
        this.bonificacionService = bonificacionService;
    }

    public double montoAsegurado() {
        return inventario.stream()
                .mapToDouble(i -> i.valor())
                .sum();
    }

    public double montoGastosAdministrativos() {
        return gastosAdministrativos.stream()
                .mapToDouble(g -> g.getMonto())
                .sum();
    }

    public double precio() {
        return (montoAsegurado() * 0.0075) + montoGastosAdministrativos();
    }

    public void agregarGastoAdministrativo(GastoAdministrativo gastoAdministrativo) {
        gastosAdministrativos.add(gastoAdministrativo);
    }

    public void agregarItem(Item item) {
        estado.agregarItem(this, item);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void agregarAInventario(Item item) {
        inventario.add(item);
    }

    public void cerrarInventario() {
        estado.cerrarInventario(this);
    }

    public void aplicarBonificacion(Integer codigoBonificacion) {
        if (bonificacionService.codigoValido(codigoBonificacion)) {
            estado.aplicarDescuento(this);
            bonificacionService.anularCodifo(codigoBonificacion);
            bonificacionService.notificarTitular(mailTitular, codigoBonificacion);
        }
    }

    public void setEstado(EstadoPoliza estado) {
        this.estado = estado;
    }

    public void eliminarGastoAdministrativoDeMayorValor() {
        GastoAdministrativo gastoAdministrativoDeMayorValor = gastosAdministrativos.stream()
                                                                .max(Comparator.comparingDouble(g -> g.getMonto()))
                                                                .get();
        gastosAdministrativos.remove(gastoAdministrativoDeMayorValor);
    }

    public void eliminarTodosLosGastosAdministrativos() {
        gastosAdministrativos.clear();
    }
}
