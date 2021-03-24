package bknd.Siam.Model.digesto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name="CATEGORIAS" )
public class Categorias implements Serializable {

	@Id
	@Column(name = "CODIGO_CATEGORIA", unique = true, length = 7)
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long   codigoCategoria;

	@Column( name = "DESCRIPCION_CATEGORIA", nullable = false, length = 100)
	private String descripcionCategoria;

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

	public Categorias() {
	}

	public Categorias(Long codigoCategoria, String descripcionCategoria, String usrreg, Date fecreg, String usrcam, Date feccam, Long tstamp) {
		this.codigoCategoria = codigoCategoria;
		this.descripcionCategoria = descripcionCategoria;
		this.usrreg = usrreg;
		this.fecreg = fecreg;
		this.usrcam = usrcam;
		this.feccam = feccam;
		this.tstamp = tstamp;
	}

	@Override
	public String toString() {
		return "Categorias{" +
				"codigoCategoria=" + codigoCategoria +
				", descripcionCategoria='" + descripcionCategoria + '\'' +
				", usrreg='" + usrreg + '\'' +
				", fecreg=" + fecreg +
				", usrcam='" + usrcam + '\'' +
				", feccam=" + feccam +
				", tstamp=" + tstamp +
				'}';
	}

	public Long getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(Long codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
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

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}
