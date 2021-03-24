package bknd.Siam.Model.digesto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "INSTITUCIONES" )
public class Documentos implements Serializable {


    private Long    consecutivo;
    private String  numeroOficio;
    private String  numeroVersion;
    private String  titulo;
    private String  web;
    private Date    fechaEmision;
    private String  ubicacionDocumento;
    private String  observaciones;

    private String  usrreg;
    private Date    fecreg;
    private String  usrcam;
    private Date    feccam;
    private Long    tstamp;

    private Long   codigoCategoria;
    private Long   codigoSubCategoria;
    private Long   codigoTema;
    private Long   codigoSubTema;

    private static final long serialVersionUID = 1L;

}
