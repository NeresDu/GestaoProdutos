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

import Model.Funcionario;

@RestController
	@RequestMapping(value = "/funcionario")
public class FuncionarioController {
	
	@Autowired
	private service.FuncionarioService FuncionarioService;
	
	@PostMapping(path = "/save")
	  public void salvarFuncionario(@RequestBody Funcionario Funcionario) {
		FuncionarioService.Salvar(Funcionario);
	 }
	
	@GetMapping(path = "/")
	  public List<Funcionario> buscarFuncionarios() {
	    return FuncionarioService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Funcionario}")
	  public Optional<Funcionario> buscarFuncionariosPorId(@PathVariable(name = "codigo_Funcionario", required = true) int codigo_Funcionario) throws Exception {
	    return FuncionarioService.buscarPorID(codigo_Funcionario);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Funcionario}")
	public void deleteFuncionario(@PathVariable(name = "codigo_Funcionario", required = true) int codigo_Funcionario) throws Exception {
		FuncionarioService.Deletar(codigo_Funcionario);
	    
	}
}
