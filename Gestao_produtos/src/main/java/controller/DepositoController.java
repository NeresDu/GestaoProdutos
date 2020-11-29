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

import Model.Deposito;

@RestController
@RequestMapping(value = "/deposito")
public class DepositoController {
	@Autowired
	private service.DepositoService DepositoService;
	
	@PostMapping(path = "/save")
	  public void salvarDeposito(@RequestBody Deposito Deposito) {
		DepositoService.Salvar(Deposito);
	 }
	
	@GetMapping(path = "/")
	  public List<Deposito> buscarDepositos() {
	    return DepositoService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Deposito}")
	  public Optional<Deposito> buscarDepositoPorId(@PathVariable(name = "codigo_Deposito", required = true) int codigo_Deposito) throws Exception {
	    return DepositoService.buscarPorID(codigo_Deposito);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Deposito}")
	public void deleteDeposito(@PathVariable(name = "codigo_Deposito", required = true) int codigo_Deposito) throws Exception {
		DepositoService.Deletar(codigo_Deposito);
	    
	}

}
