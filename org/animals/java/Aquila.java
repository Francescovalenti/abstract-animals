package org.animals.java;

public class Aquila extends Animali implements Volare{
    private String Stridisce;
    private String Carne;

    public Aquila (String razza, String nome, String Dormi,String Stridisce,String Carne){
        super(razza, nome, Dormi);
        this.Stridisce=Stridisce;
        this.Carne=Carne;
    }
    
    @Override

    public String versoAnimale(){
        return this.Stridisce;
    }

    @Override

    public String mangiaAnimale()
    {
        return this.Carne;
    }

    @Override

    public void faiVolare(){
         System.out.println("Usa le ali");
    }
}
