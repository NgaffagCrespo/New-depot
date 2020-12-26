package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.domain.Utilisateurs;

@SpringBootApplication
public class GestionStockEtVenteApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jp;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockEtVenteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="SELECT * FROM utilisateur";
		List<Utilisateurs> user=jp.query(sql, BeanPropertyRowMapper.newInstance(Utilisateurs.class));
		user.forEach(System.out::println);
	}

	
	
}
