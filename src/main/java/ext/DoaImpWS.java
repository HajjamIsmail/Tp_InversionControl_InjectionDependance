package ext;

import doa.IDoa;

public class DoaImpWS implements IDoa {
    @Override
    public double getData() {
        System.out.println("Version web Service !");
        return 90;
    }
}
