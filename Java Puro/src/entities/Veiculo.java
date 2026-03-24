package entities;

public class Veiculo {
    private String placa;
    private Double quilometrosRodados;
    private Double combustivelGasto;

    public Veiculo(String placa, Double quilometrosRodados, Double combustivelGasto) {
        this.placa = placa;
        this.quilometrosRodados = quilometrosRodados;
        this.combustivelGasto = combustivelGasto;
    }

    public Double calcularKmL() {
        return quilometrosRodados / combustivelGasto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(Double quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public Double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(Double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

}
