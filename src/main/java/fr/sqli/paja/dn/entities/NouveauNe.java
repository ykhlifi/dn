package fr.sqli.paja.dn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class NouveauNe implements Serializable {
	@Id @GeneratedValue
	private Long idNouveauNe;
	private String nom;
	private String prenom;
	private String sexe;
	private Date datenaissance;
	private Date datedeclarant;
	private String heurenaissance;
	
	@JoinColumn(name="idhopital")
	private String hopital;
	
	@JoinColumn(name="iddeclarant")
	private String declarant;
	public NouveauNe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NouveauNe(String nom, String prenom, String sexe, Date datenaissance, Date datedeclarant,
			String heurenaissance, String hopital, String declarant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.datenaissance = datenaissance;
		this.datedeclarant = datedeclarant;
		this.heurenaissance = heurenaissance;
		this.hopital = hopital;
		this.declarant = declarant;
	}
	public Long getIdNouveauNe() {
		return idNouveauNe;
	}
	public void setIdNouveauNe(Long idNouveauNe) {
		this.idNouveauNe = idNouveauNe;
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
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Date getDatedeclarant() {
		return datedeclarant;
	}
	public void setDatedeclarant(Date datedeclarant) {
		this.datedeclarant = datedeclarant;
	}
	public String getHeurenaissance() {
		return heurenaissance;
	}
	public void setHeurenaissance(String heurenaissance) {
		this.heurenaissance = heurenaissance;
	}
	public String getHopital() {
		return hopital;
	}
	public void setHopital(String hopital) {
		this.hopital = hopital;
	}
	public String getDeclarant() {
		return declarant;
	}
	public void setDeclarant(String declarant) {
		this.declarant = declarant;
	}
	
	

}
