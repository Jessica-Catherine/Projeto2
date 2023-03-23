package br.senai.sp.livro.controller;

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

import br.senai.sp.livro.dao.LivrosDAO;
import br.senai.sp.livro.model.Livro;

@RestController
@RequestMapping("/livros")
public class LivrosController {

	@Autowired
	LivrosDAO dao;

	@GetMapping
	public List<Livro> listarTodos() {
		return dao.listarTodos();
	}
	
	@GetMapping("/{id}")
	public Livro PegarPorId(@PathVariable int idLivro) {
		return dao.PegarPorId(idLivro);
	}

	@PostMapping
	public Livro inserir(@RequestBody Livro a) {
		dao.Novo(a);
		return a;
	}

	@PutMapping("/{id}")
	public Livro alterar(@RequestBody Livro livro, @PathVariable int idLivro) {
		dao.Editar(livro, idLivro);
		return livro;
	}

	@DeleteMapping("/{id}")
	public int delete( @PathVariable int idLivro) {
		dao.Deletar(idLivro);
		return idLivro;
	}
}

