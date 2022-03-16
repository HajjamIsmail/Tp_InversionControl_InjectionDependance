package metier;

import doa.IDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    //couplage faible
    //private IDoa dao;

    //Injection via Annotation Autowired
    @Autowired
    private IDoa dao;

    //private IDoa dao;

    public MetierImpl(){

    }

    public MetierImpl(IDoa dao){
        this.dao=dao;
    }

    @Override
    public double calcule() {
        double tmp= dao.getData();
        double res=tmp*540;
        return res;
    }

    // Injecter dans la variable dao un objet d'une classe qui implemente l'interface IDoa

    public void setDao(IDoa dao) {
        this.dao = dao;
    }
}
