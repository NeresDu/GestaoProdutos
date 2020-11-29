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

import Model.Risco;

@RestController
	@RequestMapping(value = "/risco")
public class RiscoController {
	
	@Autowired
	private service.RiscoService RiscoService;
	
	@PostMapping(path = "/save")
	  public void salvarRisco(@RequestBody Risco Risco) {
		RiscoService.Salvar(Risco);
	 }
	
	@GetMapping(path = "/")
	  public List<Risco> buscarRiscos() {
	    return RiscoService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Risco}")
	  public Optional<Risco> buscarRiscosPorId(@PathVariable(name = "codigo_Risco", required = true) int codigo_Risco) throws Exception {
	    return RiscoService.buscarPorID(codigo_Risco);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Risco}")
	public void deleteRisco(@PathVariable(name = "codigo_Risco", required = true) int codigo_Risco) throws Exception {
		RiscoService.Deletar(codigo_Risco);
	    
	}
}
