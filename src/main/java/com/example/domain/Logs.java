package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Logs {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	private String nom_utilisateur;
	private String date_modif;
	private String modification_effectuee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
	public String getDate_modif() {
		return date_modif;
	}
	public void setDate_modif(String date_modif) {
		this.date_modif = date_modif;
	}
	public String getModification_effectuee() {
		return modification_effectuee;
	}
	public void setModification_effectuee(String modification_effectuee) {
		this.modification_effectuee = modification_effectuee;
	}
	
	
}
