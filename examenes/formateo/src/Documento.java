public class Documento {
    private String fechaCreacion;
    private String titulo;
    private String texto;
    private String firma;
    private Formateador formateador;

    public Documento(String fechaCreacion, String titulo, String firma, String texto) {
        this.fechaCreacion = fechaCreacion;
        this.titulo = titulo;
        this.firma = firma;
        this.texto = texto;
        this.formateador = new FormateadorTextoSimple();
    }

    public String getFechaCreacion() { return fechaCreacion; }

    public String getTitulo() { return titulo; }

    public String getTexto() { return texto; }

    public String getFirma() { return firma; }

    public void setFormateador (Formateador formateador) {
        this.formateador = formateador;
    }

    public String getDocumentoFormateado() {
        return formateador.darFormato(this);
    }
}
