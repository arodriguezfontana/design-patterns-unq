public abstract class Formateador {
    public String darFormato(Documento documento) {
        return formatearFechaInicio(documento.getFechaCreacion()) +
        formatearTitulo(documento.getTitulo()) +
        formatearTexto(documento.getTexto()) +
        formatearFirma(documento.getFirma());
    }

    public abstract String formatearFechaInicio(String fechaInicio);
    public abstract String formatearTitulo(String titulo);
    public abstract String formatearTexto(String texto);
    public abstract String formatearFirma(String firma);

}
