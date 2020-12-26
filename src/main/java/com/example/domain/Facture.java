package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numero; 
	
	private String nom_Facture;
	private int quantite;
	private int prix;
	private String date_facture;
	
	private long id_boisson;
	
	
	public String getNom_Facture() {
		return nom_Facture;
	}
	public void setNom_Facture(String nom_Facture) {
		this.nom_Facture = nom_Facture;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getDate_facture() {
		return date_facture;
	}
	public void setDate_facture(String date_facture) {
		this.date_facture = date_facture;
	}
	public long getId_boisson() {
		return id_boisson;
	}
	public void setId_boisson(int id_boisson) {
		this.id_boisson = id_boisson;
	}
	
	

}
