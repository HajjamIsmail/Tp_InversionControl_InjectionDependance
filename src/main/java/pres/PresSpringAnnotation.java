package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        //indiquer dans le parametre le nom des package à scanner
        ApplicationContext context=new AnnotationConfigApplicationContext("doa","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
