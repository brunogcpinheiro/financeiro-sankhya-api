package br.com.sankhya.financeiro.service;

import java.util.List;

import br.com.sankhya.financeiro.model.Lancamento;

public interface LancamentoService {

	// Salvar lan�amento
	Long save(Lancamento lancamento);

	// Listar os lan�amentos
	List<Lancamento> list();

	// Deletar lan�amento
	void delete(Long id);
}
