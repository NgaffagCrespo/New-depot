package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Utilisateur;

@Repository
public interface Traitement_User extends JpaRepository<Utilisateur,Long> {

}
