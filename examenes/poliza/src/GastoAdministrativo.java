public class GastoAdministrativo {
    private String concepto;
    private Double monto;

    public GastoAdministrativo(String concepto, Double monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }
}
