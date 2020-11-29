package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Deposito;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Integer> {

}
