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

import Model.Produto;

@RestController
	@RequestMapping(value = "/produto")
public class ProdutoController {
	
	@Autowired
	private service.ProdutoService ProdutoService;
	
	@PostMapping(path = "/save")
	  public void salvarProduto(@RequestBody Produto Produto) {
		ProdutoService.Salvar(Produto);
	 }
	
	@GetMapping(path = "/")
	  public List<Produto> buscarProdutos() {
	    return ProdutoService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Produto}")
	  public Optional<Produto> buscarProdutosPorId(@PathVariable(name = "codigo_Produto", required = true) int codigo_Produto) throws Exception {
	    return ProdutoService.buscarPorID(codigo_Produto);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Produto}")
	public void deleteProduto(@PathVariable(name = "codigo_Produto", required = true) int codigo_Produto) throws Exception {
		ProdutoService.Deletar(codigo_Produto);
	    
	}
}
