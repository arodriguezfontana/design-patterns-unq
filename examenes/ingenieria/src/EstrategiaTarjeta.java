public class EstrategiaTarjeta implements EstrategiaFormaPago{

    private Integer cuotas;

    @Override
    public Double ajustarPrecio(Double costo) {
        return costo * 0.04 * cuotas;
    }

    @Override
    public Double costo(Actividad actividad) {
        return actividad.total() + actividad.ajustePorFormaDePago(this);
    }
}
