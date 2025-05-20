package org.animals.java;

public abstract class Animali {
    private String razza;
    private String nome;
    private String Dormi;

    public Animali(String razza, String nome, String Dormi) {
        this.razza = razza;
        this.nome = nome;
        this.Dormi = Dormi;
    }

    public String getDormi() {
        return this.Dormi;
    }

    public void Dormi() {
       System.out.println("zzzzzzzzzzzzz");
    }

    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String versoAnimale(

    );

    public abstract String mangiaAnimale();

}
