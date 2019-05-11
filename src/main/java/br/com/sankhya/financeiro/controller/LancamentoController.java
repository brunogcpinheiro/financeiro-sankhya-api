package br.com.sankhya.financeiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sankhya.financeiro.model.Lancamento;
import br.com.sankhya.financeiro.service.LancamentoService;

@RestController
public class LancamentoController {

	@Autowired
	private LancamentoService lancamentoService;

	//Listar todos os lan�amentos
	@GetMapping("/api/lancamentos")
	public ResponseEntity<List<Lancamento>> list() {
		List<Lancamento> list = lancamentoService.list();
		return ResponseEntity.ok().body(list);
	}
	
	//Salvando lan�amento
	@PostMapping("/api/lancamento")
	public ResponseEntity<?> save(@RequestBody Lancamento lancamento) {
		Long id = lancamentoService.save(lancamento);
		return ResponseEntity.ok().body("Lan�amento criado com sucesso com id: " + id);
	}
	
	//Deletar lan�amento
	@DeleteMapping("/api/lancamento/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		lancamentoService.delete(id);
		return ResponseEntity.ok().body("Lan�amento deletado com sucesso!");
	}

}
