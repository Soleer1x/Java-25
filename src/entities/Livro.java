package entities;

public class Livro {
    private String titulo;
    private Integer ano;
    private Autor escritor;

    public Livro(){

    }

    public Livro(String titulo, Integer ano, Autor escritor) {
        this.titulo = titulo;
        this.ano = ano;
        this.escritor = escritor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Livro: ");
        sb.append(titulo + " (");
        sb.append(ano + ")");
        sb.append("\n");
        sb.append("Autor: ");
        sb.append(escritor.getNome());
        sb.append(" - Nacionalidade: ");
        sb.append(escritor.getNacionalidade());

        return sb.toString();
    }
}
