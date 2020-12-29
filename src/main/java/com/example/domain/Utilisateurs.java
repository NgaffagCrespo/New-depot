package com.example.domain;



public class Utilisateurs {

	
	private long id;
	private String nom_Uti,prenom,adresse ,mail ; 
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom_Uti() {
		return nom_Uti;
	}
	public void setNom_Uti(String nom_Uti) {
		this.nom_Uti = nom_Uti;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom_Uti=" + nom_Uti + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", mail=" + mail + "]";
	}
	
	
}
