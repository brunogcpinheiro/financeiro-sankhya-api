package br.com.sankhya.financeiro.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

import br.com.sankhya.financeiro.model.enums.TipoLancamento;

@Entity(name = "Lancamento")
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private String vencimento;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal valor;
	
	private Integer tipo;
	
	public Lancamento() {
	}
	
	public Lancamento(Long id, String descricao, String vencimento, BigDecimal valor, TipoLancamento tipo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.vencimento = vencimento;
		this.valor = valor;
		this.tipo = tipo.getCod();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoLancamento getTipo() {
		return TipoLancamento.toEnum(tipo);
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo.getCod();
	}
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", vencimento=" + vencimento + ", valor=" + valor + "]";
	}
}
