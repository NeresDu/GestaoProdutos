package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Risco;

@Service
public class RiscoService {
	@Autowired
	private repository.RiscoRepository RiscoRepository;
	
	//salvar
	public void Salvar(Risco Risco) {
	    try {
	    	RiscoRepository.saveAndFlush(Risco);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Risco> buscarPorID(int Codigo_Risco) throws Exception {
		return RiscoRepository.findById(Codigo_Risco);
	    
	  }
	
	public List<Risco> BuscarTodos(){
		 return RiscoRepository.findAll();
	}
	
	public void Deletar(int Codigo_Risco) throws Exception{
	    RiscoRepository.deleteById(Codigo_Risco);
	   
	}
}
