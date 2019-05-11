package br.com.sankhya.financeiro.service;

import java.util.List;

import br.com.sankhya.financeiro.model.Lancamento;

public interface LancamentoService {

	// Salvar lançamento
	Long save(Lancamento lancamento);

	// Listar os lançamentos
	List<Lancamento> list();

	// Deletar lançamento
	void delete(Long id);
}
