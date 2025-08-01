public class EstrategiaMercadoPago implements EstrategiaFormaPago{

    @Override
    public Double ajustarPrecio(Double costo) {
        return costo * 0.03;
    }

    @Override
    public Double costo(Actividad actividad) {
        return actividad.total() - actividad.ajustePorFormaDePago(this);
    }
}
