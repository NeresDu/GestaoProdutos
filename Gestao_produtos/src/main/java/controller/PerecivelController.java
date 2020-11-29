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

import Model.Perecivel;

@RestController
	@RequestMapping(value = "/perecivel")
public class PerecivelController {
	
	@Autowired
	private service.PerecivelService PerecivelService;
	
	@PostMapping(path = "/save")
	  public void salvarPerecivel(@RequestBody Perecivel Perecivel) {
		PerecivelService.Salvar(Perecivel);
	 }
	
	@GetMapping(path = "/")
	  public List<Perecivel> buscarPerecivels() {
	    return PerecivelService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Perecivel}")
	  public Optional<Perecivel> buscarPerecivelsPorId(@PathVariable(name = "codigo_Perecivel", required = true) int codigo_Perecivel) throws Exception {
	    return PerecivelService.buscarPorID(codigo_Perecivel);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Perecivel}")
	public void deletePerecivel(@PathVariable(name = "codigo_Perecivel", required = true) int codigo_Perecivel) throws Exception {
		PerecivelService.Deletar(codigo_Perecivel);
	    
	}
}
