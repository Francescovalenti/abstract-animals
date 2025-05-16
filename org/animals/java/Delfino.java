package org.animals.java;

public class Delfino extends Animali {
    public String SuoniAcuti ;
    public String Pesci;

    public Delfino (String razza, String nome, String Dormi,String SuoniAcuti,String Pesci){
        super(razza, nome, Dormi);
        this.SuoniAcuti=SuoniAcuti;
        this.Pesci=Pesci;
    }

    @Override
    public String versoAnimale() {
        return this.SuoniAcuti;
    }

    @Override

    public String mangiaAnimale() {
        return this.Pesci;
    }

}
