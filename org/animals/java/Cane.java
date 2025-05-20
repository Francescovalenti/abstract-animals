package org.animals.java;

public class Cane extends Animali{
   private String Croccantini;
   private String Abbaia;
    
public Cane(String razza,String nome,String Croccantini,String Abbaia){
    super(razza, nome);
    this.Croccantini=Croccantini;
    this.Abbaia=Abbaia;
    
    
}

@Override
public  String versoAnimale(){
    return this.Abbaia;
    

}

@Override
public  String mangiaAnimale(){
return this.Croccantini;


}

    @Override
  
          public void dormi(){
        System.out.println("ZZZZzzzZZZzzzZZZ!");
    }

}

