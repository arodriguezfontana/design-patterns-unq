public class FormateadorLatex extends Formateador {
    @Override
    public String formatearFechaInicio(String fechaInicio) {
        return "/date{" + fechaInicio + "}";
    }

    @Override
    public String formatearTitulo(String titulo) {
        return "/title{" + titulo + "}";
    }

    @Override
    public String formatearTexto(String texto) {
        return "/begin{document}" + texto + "/end{document}";
    }

    @Override
    public String formatearFirma(String firma) {
        return "/footer{" + firma + "}";
    }
}
