package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Fornecedor_Cliente;
import service.Fornecedor_ClienteService;


@RestController
	@RequestMapping(value = "/fornecedorcliente")
public class Fornecedor_ClienteController {
	
	@Autowired
	private Fornecedor_ClienteService Fonecedor_ClienteService;
	
	@PostMapping(path = "/save")
	  public void salvarFonecedor_Cliente(@RequestBody Fornecedor_Cliente Fonecedor_Cliente) {
		Fonecedor_ClienteService.Salvar(Fonecedor_Cliente);
	 }
	
	@GetMapping(path = "/")
	  public List<Fornecedor_Cliente> buscarFornecedor_Clientes() {
	    return Fonecedor_ClienteService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Fonecedor_Cliente}")
	  public Optional<Fornecedor_Cliente> buscarFornecedor_ClientesPorId(@PathVariable(name = "codigo_Fonecedor_Cliente", required = true) int codigo_Fonecedor_Cliente) throws Exception {
	    return Fonecedor_ClienteService.buscarPorID(codigo_Fonecedor_Cliente);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Fornecedor_Cliente}")
	public void deleteFornecedor_Cliente(@PathVariable(name = "codigo_Fornecedor_Cliente", required = true) int codigo_Fornecedor_Cliente) throws Exception {
		Fonecedor_ClienteService.Deletar(codigo_Fornecedor_Cliente);
	    
	}
}
