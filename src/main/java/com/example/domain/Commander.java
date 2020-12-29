package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Commander extends Facture {

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdresse_fournisseur() {
		return adresse_fournisseur;
	}
	public void setAdresse_fournisseur(String adresse_fournisseur) {
		this.adresse_fournisseur = adresse_fournisseur;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	private String nom_fournisseur;
	private int numero_fournisseur;
	private String adresse_fournisseur;
	public String getNom_fournisseur() {
		return nom_fournisseur;
	}
	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}
	public int getNumero_fournisseur() {
		return numero_fournisseur;
	}
	public void setNumero_fournisseur(int numero_fournisseur) {
		this.numero_fournisseur = numero_fournisseur;
	}
	
	
}
