package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Gerer_Fact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long id_Utilisateur,num_personne;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_Utilisateur() {
		return id_Utilisateur;
	}
	public void setId_Utilisateur(long id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}
	public long getNum_personne() {
		return num_personne;
	}
	public void setNum_personne(long num_personne) {
		this.num_personne = num_personne;
	}
	
	
}
