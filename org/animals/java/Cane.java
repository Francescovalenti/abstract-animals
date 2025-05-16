package org.animals.java;

public class Cane extends Animali{
   private String Croccantini;
   private String Abbaia;
    
public Cane(String razza,String nome,String dormi,String Croccantini,String Abbaia){
    super(razza, nome, dormi);
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

}

