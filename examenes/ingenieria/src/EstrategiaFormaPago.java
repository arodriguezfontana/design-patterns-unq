public interface EstrategiaFormaPago {
    Double ajustarPrecio(Double costo);
    Double costo(Actividad actividad);
}
