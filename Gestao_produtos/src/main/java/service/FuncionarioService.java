package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Funcionario;

@Service
public class FuncionarioService {
	@Autowired
	private repository.FuncionarioRepository FuncionarioRepository;
	
	//salvar
	public void Salvar(Funcionario Funcionario) {
	    try {
	    	FuncionarioRepository.saveAndFlush(Funcionario);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Funcionario> buscarPorID(int Codigo_Funcionario) throws Exception {
		return FuncionarioRepository.findById(Codigo_Funcionario);
	    
	  }
	
	public List<Funcionario> BuscarTodos(){
		 return FuncionarioRepository.findAll();
	}
	
	public void Deletar(int Codigo_Funcionario) throws Exception{
	    FuncionarioRepository.deleteById(Codigo_Funcionario);
	   
	}
}
