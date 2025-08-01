public class EstrategiaEfectivo implements EstrategiaFormaPago{

    @Override
    public Double ajustarPrecio(Double costo) {
        return 0.0;
    }

    @Override
    public Double costo(Actividad actividad) {
        return actividad.total();
    }
}
