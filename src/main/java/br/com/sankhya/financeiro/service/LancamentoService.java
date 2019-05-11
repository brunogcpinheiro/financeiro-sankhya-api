package br.com.sankhya.financeiro.service;

import java.util.List;

import br.com.sankhya.financeiro.model.Lancamento;

public interface LancamentoService {

	// Salvar lanšamento
	Long save(Lancamento lancamento);

	// Listar os lanšamentos
	List<Lancamento> list();

	// Deletar lanšamento
	void delete(Long id);
}
