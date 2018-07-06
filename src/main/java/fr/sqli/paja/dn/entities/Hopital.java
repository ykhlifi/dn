package fr.sqli.paja.dn.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hopital implements Serializable {
	@Id  
	private String idHopital;
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	@OneToMany
	private Collection<NouveauNe> enfants;
	@OneToMany
	private Collection<Declarant> declarants;
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hopital(String idHopital, String nom, String adresse, String telephone, String email) {
		super();
		this.idHopital = idHopital;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	public String getIdHopital() {
		return idHopital;
	}
	public void setIdHopital(String idHopital) {
		this.idHopital = idHopital;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<NouveauNe> getEnfants() {
		return enfants;
	}
	public void setEnfants(Collection<NouveauNe> enfants) {
		this.enfants = enfants;
	}
	public Collection<Declarant> getDeclarants() {
		return declarants;
	}
	public void setDeclarants(Collection<Declarant> declarants) {
		this.declarants = declarants;
	}
	
}
