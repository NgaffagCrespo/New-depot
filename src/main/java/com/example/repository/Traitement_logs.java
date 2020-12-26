package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Facture;
import com.example.domain.Logs;

@Repository
public interface Traitement_logs extends JpaRepository<Logs,Long>{

}
