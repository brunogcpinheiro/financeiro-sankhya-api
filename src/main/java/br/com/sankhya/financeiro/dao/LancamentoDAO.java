package br.com.sankhya.financeiro.dao;

import java.util.List;

import br.com.sankhya.financeiro.model.Lancamento;

public interface LancamentoDAO {
	
	//Salvar lancamento
	Long save(Lancamento lancamento);
	
	//Listar os lancamentos
	List<Lancamento> list();
	
	//Deletar lancamento
	void delete(Long id);
}
