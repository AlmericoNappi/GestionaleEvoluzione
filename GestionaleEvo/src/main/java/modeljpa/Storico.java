package modeljpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Impiegato.findAll", query="SELECT s FROM Storico s")
public class Storico implements Serializable{
	private static final long serialVersionUID = 1L;

@Id
	private String idStorico;

	private int matricola;
	
	private String idRuolo;
	
	@Temporal(TemporalType.DATE)
	private String dataInizio;
	
	@Temporal(TemporalType.DATE)
	private String dataFine;
	
	@ManyToOne
	@JoinColumn(name="matricola")
	private Impiegato impiegato;
	
	@ManyToOne
	@JoinColumn(name="idruolo")
	private Ruolo ruolo;

	public String getIdStorico() {
		return idStorico;
	}

	public void setIdStorico(String idStorico) {
		this.idStorico = idStorico;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(String idRuolo) {
		this.idRuolo = idRuolo;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public Impiegato getImpiegato() {
		return impiegato;
	}

	public void setImpiegato(Impiegato impiegato) {
		this.impiegato = impiegato;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}