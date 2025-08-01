public class FormateadorHTML extends Formateador{
    @Override
    public String formatearFechaInicio(String fechaInicio) {
        return "";
    }

    @Override
    public String formatearTitulo(String titulo) {
        return "<title>" + titulo + "</title>";
    }

    @Override
    public String formatearTexto(String texto) {
        return "<body>" + texto + "</body>";
    }

    @Override
    public String formatearFirma(String firma) {
        return "<footer>" + firma + "</footer>";
    }
}