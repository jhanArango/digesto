package bknd.Siam.Model.digesto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "INSTITUCIONES" )
public class Documentos implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "CONSECUTIVO", unique = true, length = 7)
    private Long    consecutivo;

    @Column( name = "NUMERO_OFICIO", nullable = true, length = 15 )
    private String  numeroOficio;

    @Column( name = "NUMERO_VERSION", nullable = true, length = 15 )
    private String  numeroVersion;

    @Column( name = "TITULO", nullable = false, length = 200 )
    private String  titulo;

    @Column( name = "WEB", nullable = true, length = 45 )
    private String  web;

    @Column( name = "FECHA_EMISION", nullable = false )
    @Temporal(TemporalType.TIMESTAMP)
    private Date    fechaEmision;

    @Column( name = "UBICACION_DOCUMENTOS", nullable = false, length = 100 )
    private String  ubicacionDocumento;

    @Column(name = "OBSERVACIONES", nullable = true, length = 100, columnDefinition="TEXT")
    private String  observaciones;

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

    @Column(name = "CODIGO_SUBCATEGORIA", nullable = false, length = 7)
    private Long   codigoSubCategoria;

    @Column( name = "CODIGO_TEMA", nullable = false, length = 7)
    private Long   codigoTema;

    @Column( name = "CODIGO_SUBTEMA", nullable = false, length = 7)
    private Long   codigoSubTema;

    @Column( name = "CODIGO_INSTITUCION", nullable = false, length = 7)
    private Long   codigoInstitucion;

    private static final long serialVersionUID = 1L;

    public Long getCodigoInstitucion() {
        return codigoInstitucion;
    }

    public void setCodigoInstitucion(Long codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getNumeroOficio() {
        return numeroOficio;
    }

    public void setNumeroOficio(String numeroOficio) {
        this.numeroOficio = numeroOficio;
    }

    public String getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(String numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getUbicacionDocumento() {
        return ubicacionDocumento;
    }

    public void setUbicacionDocumento(String ubicacionDocumento) {
        this.ubicacionDocumento = ubicacionDocumento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Long getCodigoSubCategoria() {
        return codigoSubCategoria;
    }

    public void setCodigoSubCategoria(Long codigoSubCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
    }

    public Long getCodigoTema() {
        return codigoTema;
    }

    public void setCodigoTema(Long codigoTema) {
        this.codigoTema = codigoTema;
    }

    public Long getCodigoSubTema() {
        return codigoSubTema;
    }

    public void setCodigoSubTema(Long codigoSubTema) {
        this.codigoSubTema = codigoSubTema;
    }



    public Documentos() {
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "consecutivo=" + consecutivo +
                ", numeroOficio='" + numeroOficio + '\'' +
                ", numeroVersion='" + numeroVersion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", web='" + web + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", ubicacionDocumento='" + ubicacionDocumento + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", usrreg='" + usrreg + '\'' +
                ", fecreg=" + fecreg +
                ", usrcam='" + usrcam + '\'' +
                ", feccam=" + feccam +
                ", tstamp=" + tstamp +
                ", codigoCategoria=" + codigoCategoria +
                ", codigoSubCategoria=" + codigoSubCategoria +
                ", codigoTema=" + codigoTema +
                ", codigoSubTema=" + codigoSubTema +
                ", codigoInstitucion=" + codigoInstitucion +
                '}';
    }

    public Documentos(Long consecutivo, String numeroOficio, String numeroVersion, String titulo, String web, Date fechaEmision, String ubicacionDocumento, String observaciones, String usrreg, Date fecreg, String usrcam, Date feccam, Long tstamp, Long codigoCategoria, Long codigoSubCategoria, Long codigoTema, Long codigoSubTema, Long codigoInstitucion) {
        this.consecutivo = consecutivo;
        this.numeroOficio = numeroOficio;
        this.numeroVersion = numeroVersion;
        this.titulo = titulo;
        this.web = web;
        this.fechaEmision = fechaEmision;
        this.ubicacionDocumento = ubicacionDocumento;
        this.observaciones = observaciones;
        this.usrreg = usrreg;
        this.fecreg = fecreg;
        this.usrcam = usrcam;
        this.feccam = feccam;
        this.tstamp = tstamp;
        this.codigoCategoria = codigoCategoria;
        this.codigoSubCategoria = codigoSubCategoria;
        this.codigoTema = codigoTema;
        this.codigoSubTema = codigoSubTema;
        this.codigoInstitucion = codigoInstitucion;
    }
}
