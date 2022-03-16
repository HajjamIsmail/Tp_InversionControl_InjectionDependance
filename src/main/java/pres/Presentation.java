package pres;

import doa.DaoImpl;
import metier.MetierImpl;
import ext.DoaImp2;

public class Presentation {
    public static void main(String[] args) {
        //Injection des dependance par Instanciation static :=> new
        //DaoImpl doa = new DaoImpl();
        DoaImp2 doa = new DoaImp2();
        MetierImpl metier = new MetierImpl(doa);
        metier.setDao(doa);
        System.out.println(metier.calcule());
    }
}
