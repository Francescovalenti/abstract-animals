package org.animals.java;

public class main {
    public static void main(String[] args) {
        Cane cagnolino = new Cane("pastore tedesco", "Rex", "Croccatini", "Abbaia");

        System.out.println(cagnolino.mangiaAnimale());
        System.out.println(cagnolino.versoAnimale());
        cagnolino.dormi();

        Aquila Aquilotto = new Aquila("Aquila reale", "dream america","Stridisce", "Carne");
        System.out.println(Aquilotto.mangiaAnimale());
        System.out.println(Aquilotto.versoAnimale());
        Aquilotto.dormi();
        Aquilotto.faiVolare();

        Passerotto Uccellino = new Passerotto("Passera d'italia", "Uccellino", "Cingutta", "Onnivoro");
        System.out.println(Uccellino.mangiaAnimale());
        System.out.println(Uccellino.versoAnimale());
        Uccellino.dormi();
        Uccellino.faiVolare();
        Delfino Delfo = new Delfino("tursiope", "flipper", "SuoniAcuti", "Pesci");
        System.out.println(Delfo.mangiaAnimale());
        System.out.println(Delfo.versoAnimale());
        Delfo.dormi();
        Delfo.faiNuoto();
        


        

}
}
