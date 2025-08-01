public class Item {
    private Integer cantidad;
    private Double valorUnitario;

    public Item(Integer cantidad, Double valorUnitario) {
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public Double valor() {
        return cantidad * valorUnitario;
    }
}
