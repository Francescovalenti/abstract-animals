package org.animals.java;

public class Passerotto extends Animali implements Volare {
   private String Cinguetta;
    private String Onnivoro;

    public Passerotto (String razza, String nome,String Cinguetta,String Onnivoro){
        super(razza, nome);
        this.Cinguetta=Cinguetta;
        this.Onnivoro=Onnivoro;
    }

    @Override
    public String versoAnimale(){
        return this.Cinguetta;
    }

    @Override

public String mangiaAnimale(){
    return this.Onnivoro;
}
@Override

public void faiVolare(){
    System.out.println("usa delle piccole ali");
}

    @Override
  
          public void dormi(){
        System.out.println("ZZZZzzzZZZzzzZZZ!");
    }
}
