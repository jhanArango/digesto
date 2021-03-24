package bknd.Siam.Model.digesto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "INSTITUCION" )
public class Instituciones implements Serializable {


    private Long   codigoInstitucion;
    private String nombre;
    private String nombreContacto;
    private String telefono;

    private String usrreg;
    private Date   fecreg;
    private String usrcam;
    private Date   feccam;
    private Long   tstamp;


    private static final long serialVersionUID = 1L;


}
