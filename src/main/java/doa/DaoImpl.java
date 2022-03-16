package doa;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDoa {
    @Override
    public double getData() {
        System.out.println("Version Data");
        double temp=40*Math.PI;
        return temp;
    }
}
