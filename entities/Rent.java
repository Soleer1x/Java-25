package entities;

public class Rent {
    private String nomes;
    private String email;

    public Rent (){

    }

    public Rent(String nomes, String email) {
        this.nomes = nomes;
        this.email = email;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return nomes + ", " + email;
    }
}
