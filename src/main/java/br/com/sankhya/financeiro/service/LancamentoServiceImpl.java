package br.com.sankhya.financeiro.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sankhya.financeiro.dao.LancamentoDAO;
import br.com.sankhya.financeiro.model.Lancamento;

@Service
public class LancamentoServiceImpl implements LancamentoService{

	@Autowired
	private LancamentoDAO lancamentoDAO;
	
	@Override
	@Transactional
	public Long save(Lancamento lancamento) {
		return lancamentoDAO.save(lancamento);
	}

	@Override
	@Transactional
	public List<Lancamento> list() {
		return lancamentoDAO.list();
	}

	@Override
	public void delete(Long id) {
		
	}

}
