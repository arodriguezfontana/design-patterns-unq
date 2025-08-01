public class Transporte implements Actividad {
    private Double distancia;
    private Double pesoDeCarga;
    private Double precio;

    @Override
    public Double total() {
        return distancia * pesoDeCarga * precio;
    }

    @Override
    public Double ajustePorFormaDePago(EstrategiaFormaPago formaDePago) {
        return 0.0;
    }
}
