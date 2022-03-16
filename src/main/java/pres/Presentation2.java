package pres;
import doa.IDoa;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(new File("config.txt"));

        String doaClassName=sc.nextLine();
        Class cDoa=Class.forName(doaClassName);
        IDoa doa=(IDoa) cDoa.newInstance();

        String metierClassName=sc.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDoa.class);
        //invoquer la methode qu'on fait appel (setDoa)
        method.invoke(metier,doa);

        System.out.println("Resultat=>"+metier.calcule());
    }
}
