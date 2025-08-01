public interface BonificacionService {
    boolean codigoValido(Integer codigoBonificacion);
    void anularCodifo(Integer codigoBonificacion);
    void notificarTitular(String mail, Integer codigoBonificacion);
}
