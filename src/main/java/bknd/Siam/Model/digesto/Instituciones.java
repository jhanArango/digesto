package bknd.Siam.Model.digesto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "INSTITUCION" )
public class Instituciones implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_INSTITUCION", unique = true, length = 7)
    private Long   codigoInstitucion;

    @Column( name = "NOMBRE", nullable = false, length = 200 )
    private String nombre;

    @Column( name = "NOMBRE_CONTACTO", nullable = true, length = 150 )
    private String nombreContacto;

    @Column( name = "TELEFONO", nullable = true, length = 45 )
    private String telefono;

    @Column( name = "usrreg", nullable = false, length = 20 )
    private String usrreg;

    @Column( name = "fecreg", nullable = false )
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fecreg;

    @Column( name = "usrcam", nullable = true, length = 20 )
    private String usrcam;

    @Column( name = "feccam", nullable = true )
    @Temporal(TemporalType.TIMESTAMP)
    private Date   feccam;

    @Column( name = "tstamp", nullable = false, length = 14 )
    private Long   tstamp;


    private static final long serialVersionUID = 1L;


}
