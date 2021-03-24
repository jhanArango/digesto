package bknd.Siam.Model.digesto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table( name = "SUBCATEGORIA" )
public class SubCategorias  implements Serializable  {

    private Long   codigoSubCategoria;
    private String descripcionSubCategoria;

    private String usrreg;
    private Date   fecreg;
    private String usrcam;
    private Date   feccam;
    private Long   tstamp;

    private Long   codigoCategoria;

    private static final long serialVersionUID = 1L;




}
