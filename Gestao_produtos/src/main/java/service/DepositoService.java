package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Deposito;


@Service
public class DepositoService {
	@Autowired
	private repository.DepositoRepository DepositoRepository;
	
	//salvar
	public void Salvar(Deposito Deposito) {
	    try {
	    	DepositoRepository.saveAndFlush(Deposito);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Deposito> buscarPorID(int Codigo_Deposito) throws Exception {
		return DepositoRepository.findById(Codigo_Deposito);
	    
	  }
	
	public List<Deposito> BuscarTodos(){
		 return DepositoRepository.findAll();
	}
	
	public void Deletar(int Codigo_Deposito) throws Exception{
	    DepositoRepository.deleteById(Codigo_Deposito);
	   
	}

}
