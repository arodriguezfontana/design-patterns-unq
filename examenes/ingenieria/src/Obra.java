import java.util.*;

public class Obra implements Actividad {
    private List<Material> materiales;
    private List<Operario> operarios;

    @Override
    public Double total() {
        return costoDeTodosLosMateriales() + costoDeTodosLosOperarios();
    }

    @Override
    public Double ajustePorFormaDePago(EstrategiaFormaPago formaDePago) {
        return formaDePago.ajustarPrecio(costoDeTodosLosMateriales());
    }

    public Double costoDeTodosLosMateriales() {
        return materiales.stream()
                .mapToDouble(m -> m.valor())
                .sum();
    }

    public Double costoDeTodosLosOperarios() {
        return operarios.stream()
                .mapToDouble(o -> o.sueldo())
                .sum();
    }
}
