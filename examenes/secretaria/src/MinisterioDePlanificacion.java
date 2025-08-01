import java.util.*;

public class MinisterioDePlanificacion {

    public float montoTotalAInvertir(List<Secretaria> secretarias) {
        float total = 0;
        for (Secretaria secretaria : secretarias) {
            total += secretaria.montoTotal();
        }
        return total;
    }

}
