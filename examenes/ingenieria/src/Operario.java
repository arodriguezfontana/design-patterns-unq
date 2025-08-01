public class Operario {
    private Integer horas;
    private Double valorPorHora;
    private Integer añosAntiguedad;

    public Double sueldo() {
        return horas * valorPorHora * procentajeExtraPorAntiguedad();
    }

    private Double procentajeExtraPorAntiguedad() {
        return (añosAntiguedad > 5) ? 1.10 : 1.0;
    }
}
