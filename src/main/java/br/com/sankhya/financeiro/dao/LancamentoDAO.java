package br.com.sankhya.financeiro.dao;

import java.util.List;

import br.com.sankhya.financeiro.model.Lancamento;

public interface LancamentoDAO {
	
	//Salvar lanšamento
	Long save(Lancamento lancamento);
	
	//Listar os lanšamentos
	List<Lancamento> list();
	
	//Deletar lanšamento
	void delete(Long id);
}
