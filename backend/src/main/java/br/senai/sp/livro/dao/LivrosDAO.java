package br.senai.sp.livro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.senai.sp.livro.model.Livro;

@Repository
public class LivrosDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Livro> listarTodos() {
		String sql = "SELECT ANODEPUBLICACAO, PRECO, NOME, AUTOR, GENERO, EDITORA, QTDESTOQUE FROM LIVROS";
		List<Livro> lista = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Livro.class));
		return lista;
	}

	public Livro PegarPorId(int idLivro) {

		String sql = "SELECT ANODEPUBLICACAO, PRECO, NOME, AUTOR, GENERO, EDITORA, QTDESTOQUE FROM LIVROS WHERE ID = ?";
		Object[] params = { idLivro };
		Livro a = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Livro.class), params);
		return a;

	}

	public int Novo(Livro a) {

		String sql = "INSERT INTO LIVROS (ANODEPUBLICACAO, PRECO, NOME, AUTOR, GENERO, EDITORA, QTDESTOQUE) VALUES (?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, a.getAnoDePublicacao(), a.getPreco(), a.getNome(), a.getAutor(),
				a.getGenero(), a.getEditora(), a.getQtdEstoque());

		return result;		
	}

	public int Editar(Livro a, int idLivro) {
		String sql = "UPDATE LIVROS SET ANODEPUBLICACAO=?, PRECO=?, NOME=?, AUTOR=?, GENERO=?, EDITORA=?, QTDESTOQUE=? WHERE ID =?";
		Object[] params = { a.getAnoDePublicacao(), a.getPreco(), a.getNome(), a.getAutor(), a.getGenero(),
				a.getEditora(), a.getQtdEstoque() };
		int result = jdbcTemplate.update(sql, params, idLivro);
		return result;
	}

	public int Deletar(int idLivro) {
		String sql = "DELETE FROM LIVROS WHERE ID =?";
		Object[] params = { idLivro };
		int result = jdbcTemplate.update(sql, params, idLivro);
		return result;
	}
}
