public class SecretariaDeInfraestructuraAdapter implements Secretaria {

    private SecretariaDeInfraestructura secretaria;

    public SecretariaDeInfraestructuraAdapter(SecretariaDeInfraestructura secretariaDeInfraestructura) {
        this.secretaria = secretariaDeInfraestructura;
    }

    @Override
    public Double montoTotal() {
        return secretaria.inversionTotal();
    }
}
