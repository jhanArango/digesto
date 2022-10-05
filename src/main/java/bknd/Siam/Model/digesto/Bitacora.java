package bknd.Siam.Model.digesto;

import java.util.Date;

public class Bitacora {

    protected String usrreg;
    protected Date fecreg;
    protected String usrcam;
    protected Date   feccam;
    protected Float  tstamp;
    private boolean status;



    @Override
    public String toString() {
        return "Bitacora{" +
                "usrreg='" + usrreg + '\'' +
                ", fecreg=" + fecreg +
                ", usrcam='" + usrcam + '\'' +
                ", feccam=" + feccam +
                ", tstamp=" + tstamp +
                '}';
    }
}
