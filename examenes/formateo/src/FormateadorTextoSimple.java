public class FormateadorTextoSimple extends Formateador{
    @Override
    public String formatearFechaInicio(String fechaInicio) {
        return "Fecha de creacion: " + fechaInicio;
    }

    @Override
    public String formatearTitulo(String titulo) {
        return "Titulo: " + titulo;
    }

    @Override
    public String formatearTexto(String texto) {
        return "Texto: " + texto;
    }

    @Override
    public String formatearFirma(String firma) {
        return "Pie: " + firma;
    }
}
