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

import Model.Filial;

@RestController
@RequestMapping(value = "/filial")
public class FilialController {
	
	@Autowired
	private service.FilialService FilialService;
	
	@PostMapping(path = "/save")
	  public void salvarFilial(@RequestBody Filial Filial) {
		FilialService.Salvar(Filial);
	 }
	
	@GetMapping(path = "/")
	  public List<Filial> buscarFilials() {
	    return FilialService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Filial}")
	  public Optional<Filial> buscarFilialsPorId(@PathVariable(name = "codigo_Filial", required = true) int codigo_Filial) throws Exception {
	    return FilialService.buscarPorID(codigo_Filial);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Filial}")
	public void deleteFilial(@PathVariable(name = "codigo_Filial", required = true) int codigo_Filial) throws Exception {
		FilialService.Deletar(codigo_Filial);
	    
	}

}
