package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Filial;


@Service
public class FilialService {
	@Autowired
	private repository.FilialRepository FilialRepository;
	
	//salvar
	public void Salvar(Filial Filial) {
	    try {
	    	FilialRepository.saveAndFlush(Filial);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Filial> buscarPorID(int Codigo_Filial) throws Exception {
		return FilialRepository.findById(Codigo_Filial);
	    
	  }
	
	public List<Filial> BuscarTodos(){
		 return FilialRepository.findAll();
	}
	
	public void Deletar(int Codigo_Filial) throws Exception{
	    FilialRepository.deleteById(Codigo_Filial);
	   
	}

}
