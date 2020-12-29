package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Facture;
import com.example.domain.Livrer;

@Repository
public interface Traitement_Livrer extends JpaRepository<Livrer,Long> {

}
