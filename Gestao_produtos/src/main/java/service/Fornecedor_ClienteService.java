package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Fornecedor_Cliente;
import repository.Fornecedor_ClienteRepository;

@Service
public class Fornecedor_ClienteService {
	@Autowired
	private Fornecedor_ClienteRepository Forncedor_ClienteRepository;
	
	//salvar
	public void Salvar(Fornecedor_Cliente Forncedor_Cliente) {
	    try {
	    	Forncedor_ClienteRepository.saveAndFlush(Forncedor_Cliente);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Fornecedor_Cliente> buscarPorID(int Codigo_Forncedor_Cliente) throws Exception {
		return Forncedor_ClienteRepository.findById(Codigo_Forncedor_Cliente);
	    
	  }
	
	public List<Fornecedor_Cliente> BuscarTodos(){
		 return Forncedor_ClienteRepository.findAll();
	}
	
	public void Deletar(int Codigo_Forncedor_Cliente) throws Exception{
	    Forncedor_ClienteRepository.deleteById(Codigo_Forncedor_Cliente);
	   
	}
}
