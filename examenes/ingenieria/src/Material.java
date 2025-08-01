public class Material {
    private Integer cantidad;
    private Double precioUnitario;

    public Double valor() {
        return cantidad * precioUnitario;
    }
}
