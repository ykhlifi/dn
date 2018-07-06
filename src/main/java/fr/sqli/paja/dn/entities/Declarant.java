package fr.sqli.paja.dn.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Declarant implements Serializable {
	@Id
	private String idDeclarant;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	@OneToMany
	private Collection<NouveauNe> enfants;
	@OneToMany
	private Collection<Hopital> hopitals;
	public Declarant() {
		super();
		
	}
	public Declarant(String idDeclarant, String nom, String prenom, String telephone, String email) {
		super();
		this.idDeclarant = idDeclarant;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
	}
	public String getIdDeclarant() {
		return idDeclarant;
	}
	public void setIdDeclarant(String idDeclarant) {
		this.idDeclarant = idDeclarant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	public Collection<Hopital> getHopitals() {
		return hopitals;
	}
	public void setHopitals(Collection<Hopital> hopitals) {
		this.hopitals = hopitals;
	}

}
