package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Fornecedor_Cliente;

@Repository
public interface Fornecedor_ClienteRepository extends JpaRepository<Fornecedor_Cliente, Integer>{

}
