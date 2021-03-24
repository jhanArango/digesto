package bknd.Siam.Model.digesto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "SUBCATEGORIA" )
public class SubCategorias  implements Serializable  {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_SUBCATEGORIA", unique = true, length = 7)
    private Long   codigoSubCategoria;

    @Column( name = "DESCRIPCION_SUBCATEGORIA", nullable = false, length = 100)
    private String descripcionSubCategoria;

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


    @Column(name = "CODIGO_CATEGORIA", nullable = false, length = 7)
    private Long   codigoCategoria;


    private static final long serialVersionUID = 1L;

    public Long getCodigoSubCategoria() {
        return codigoSubCategoria;
    }

    public void setCodigoSubCategoria(Long codigoSubCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
    }

    public String getDescripcionSubCategoria() {
        return descripcionSubCategoria;
    }

    public void setDescripcionSubCategoria(String descripcionSubCategoria) {
        this.descripcionSubCategoria = descripcionSubCategoria;
    }

    public String getUsrreg() {
        return usrreg;
    }

    public void setUsrreg(String usrreg) {
        this.usrreg = usrreg;
    }

    public Date getFecreg() {
        return fecreg;
    }

    public void setFecreg(Date fecreg) {
        this.fecreg = fecreg;
    }

    public String getUsrcam() {
        return usrcam;
    }

    public void setUsrcam(String usrcam) {
        this.usrcam = usrcam;
    }

    public Date getFeccam() {
        return feccam;
    }

    public void setFeccam(Date feccam) {
        this.feccam = feccam;
    }

    public Long getTstamp() {
        return tstamp;
    }

    public void setTstamp(Long tstamp) {
        this.tstamp = tstamp;
    }

    public Long getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    @Override
    public String toString() {
        return "SubCategorias{" +
                "codigoSubCategoria=" + codigoSubCategoria +
                ", descripcionSubCategoria='" + descripcionSubCategoria + '\'' +
                ", usrreg='" + usrreg + '\'' +
                ", fecreg=" + fecreg +
                ", usrcam='" + usrcam + '\'' +
                ", feccam=" + feccam +
                ", tstamp=" + tstamp +
                ", codigoCategoria=" + codigoCategoria +
                '}';
    }

    public SubCategorias() {
    }

    public SubCategorias(Long codigoSubCategoria, String descripcionSubCategoria, String usrreg, Date fecreg, String usrcam, Date feccam, Long tstamp, Long codigoCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
        this.descripcionSubCategoria = descripcionSubCategoria;
        this.usrreg = usrreg;
        this.fecreg = fecreg;
        this.usrcam = usrcam;
        this.feccam = feccam;
        this.tstamp = tstamp;
        this.codigoCategoria = codigoCategoria;
    }

}
