package bknd.Siam.Model.digesto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table ( name = "SUBTEMAS" )
public class subTemas implements Serializable {

    private Long   codigoSubTema;
    private String descripcionSubTema;

    private String usrreg;
    private Date   fecreg;
    private String usrcam;
    private Date   feccam;
    private Long   tstamp;

    private Long   codigoCategoria;
    private Long   codigoSubCategoria;
    private Long   codigoTema;


    private static final long serialVersionUID = 1L;

}
