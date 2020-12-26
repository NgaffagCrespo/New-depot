package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Boisson;
import com.example.domain.Facture;

@Repository
public interface Traitement_Boisson extends JpaRepository<Boisson,Long>{

}
