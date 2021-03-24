package bknd.Siam.Model.digesto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table ( name = "TEMAS" )
public class Temas   implements Serializable  {

    private Long   codigoTema;
    private String descripcionTema;

    private String usrreg;
    private Date   fecreg;
    private String usrcam;
    private Date   feccam;
    private Long   tstamp;

    private Long   codigoCategoria;
    private Long   codigoSubCategoria;


    private static final long serialVersionUID = 1L;


}
