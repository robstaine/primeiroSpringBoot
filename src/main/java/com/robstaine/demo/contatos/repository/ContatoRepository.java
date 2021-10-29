package com.robstaine.demo.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robstaine.demo.contatos.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

		
	Contato findById(long id);
			
	
}
