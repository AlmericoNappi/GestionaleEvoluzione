package modeljpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Impiegato.findAll", query="SELECT r FROM Ruolo r")
public class Ruolo implements Serializable{
	private static final long serialVersionUID = 1L;

@Id
	private String idRuolo;

	private String descrizione;

@OneToMany(mappedBy="ruolo")
private List<Storico>storicos;

public String getIdRuolo() {
	return idRuolo;
}

public void setIdRuolo(String idRuolo) {
	this.idRuolo = idRuolo;
}

public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}

public List<Storico> getStoricos() {
	return storicos;
}

public void setStoricos(List<Storico> storicos) {
	this.storicos = storicos;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




}
