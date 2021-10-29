package com.robstaine.demo.contatos.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.robstaine.demo.contatos.repository.ContatoRepository;
import com.robstaine.demo.contatos.models.Contato;

@RestController
@RequestMapping(value="/api")
public class ContatoResource {

	@Autowired
	ContatoRepository contatoRepository;
	
	@GetMapping("/contatos")
	public List<Contato> listaContatos() {
		return contatoRepository.findAll();
	}	


	@GetMapping("/contato/{id}")
	public Contato listaContatoEspecifico(@PathVariable(value="id") long id) {
		return contatoRepository.findById(id);
	}	

	
	@PostMapping("/contato")
	public Contato salvaContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	

	@DeleteMapping("/contato")
	public void deletaContato(@RequestBody Contato contato) {
		contatoRepository.delete(contato);
	}
	
	
	@PutMapping("/contato")
	public Contato atualizaContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	
	
}
