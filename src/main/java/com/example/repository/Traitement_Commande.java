package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Commander;
import com.example.domain.Facture;

@Repository
public interface Traitement_Commande extends JpaRepository<Commander,Long>{

}
