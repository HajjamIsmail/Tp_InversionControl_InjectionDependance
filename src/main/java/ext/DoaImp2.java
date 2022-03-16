package ext;

import doa.IDoa;

public class DoaImp2 implements IDoa {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        return 400;
    }
}
