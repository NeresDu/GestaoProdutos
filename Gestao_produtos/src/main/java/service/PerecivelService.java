package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Perecivel;

@Service
public class PerecivelService {
	@Autowired
	private repository.PerecivelRepository PerecivelRepository;
	
	//salvar
	public void Salvar(Perecivel Perecivel) {
	    try {
	    	PerecivelRepository.saveAndFlush(Perecivel);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Perecivel> buscarPorID(int Codigo_Perecivel) throws Exception {
		return PerecivelRepository.findById(Codigo_Perecivel);
	    
	  }
	
	public List<Perecivel> BuscarTodos(){
		 return PerecivelRepository.findAll();
	}
	
	public void Deletar(int Codigo_Perecivel) throws Exception{
	    PerecivelRepository.deleteById(Codigo_Perecivel);
	   
	}
}
