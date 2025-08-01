public class EmpresaIngenieria {
    private EstrategiaFormaPago formaDePago;
    private Actividad actividad;
    private String razonSocial;
    private String cuit;

    public void setFormaDePago() {
        this.formaDePago = formaDePago;
    }

    public Double costoTotal() {
        return formaDePago.costo(actividad);
    }
}
