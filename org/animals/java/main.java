package org.animals.java;

public class main {
    public static void main(String[] args) {
        Cane cagnolino= new Cane("pastore tedesco", "Rex", "zzz", "Croccatini", "Abbaia");

        System.out.println(cagnolino.mangiaAnimale());
        System.out.println(cagnolino.versoAnimale());
        System.out.println(cagnolino.getDormi());

        Aquila Aquilotto = new Aquila("Aquila reale", "dream america", "zzz", "Stridisce", "Carne");
        System.out.println(Aquilotto.mangiaAnimale());
        System.out.println(Aquilotto.versoAnimale());
        System.out.println(Aquilotto.getDormi());
        
    }
    
}
