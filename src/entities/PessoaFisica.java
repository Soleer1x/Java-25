package entities;

public class PessoaFisica extends Contribuinte {
    private Double gastosSaude;

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double slaoquevaiaqui() {
        return 0.0;
    }
}
