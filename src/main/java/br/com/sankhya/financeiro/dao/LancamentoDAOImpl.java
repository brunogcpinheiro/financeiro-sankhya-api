package br.com.sankhya.financeiro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.sankhya.financeiro.model.Lancamento;

@Repository
public class LancamentoDAOImpl implements LancamentoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long save(Lancamento lancamento) {
		sessionFactory.getCurrentSession().save(lancamento);
		return lancamento.getId();
	}

	@Override
	public List<Lancamento> list() {
		List<Lancamento> list = sessionFactory.getCurrentSession().createQuery("from Lancamento").list();
		return list;
	}

	@Override
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Lancamento lancamento = session.byId(Lancamento.class).load(id);
		session.delete(lancamento);
	}
	
}
