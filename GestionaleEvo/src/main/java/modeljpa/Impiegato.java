package modeljpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

	@Entity
@NamedQuery(name="Impiegato.findAll", query="SELECT i FROM Impiegato i")
public class Impiegato implements Serializable{
		private static final long serialVersionUID = 1L;

		private String nome;
		
		private String cognome;
		
		private String codiceFiscale;
		@Id
		private int matricola;

		@OneToMany(mappedBy="impiegato")
		private List<Storico> storicos;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public String getCodiceFiscale() {
			return codiceFiscale;
		}

		public void setCodiceFiscale(String codiceFiscale) {
			this.codiceFiscale = codiceFiscale;
		}

		public int getMatricola() {
			return matricola;
		}

		public void setMatricola(int matricola) {
			this.matricola = matricola;
		}

		public List<Storico> getStoricos() {
			return storicos;
		}

		public void setStoricos(List<Storico> storicos) {
			this.storicos = storicos;
		}
		
		
		
}
