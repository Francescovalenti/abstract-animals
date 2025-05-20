package org.animals.java;

public class Delfino extends Animali implements Nuotante {
    public String SuoniAcuti ;
    public String Pesci;

    public Delfino (String razza, String nome,String SuoniAcuti,String Pesci){
        super(razza, nome );
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

    @Override

    public void faiNuoto(){
        System.out.println("usa le pinne");
    }
      @Override
  
          public void dormi(){
        System.out.println("ZZZZzzzZZZzzzZZZ!");
    }
    
}
