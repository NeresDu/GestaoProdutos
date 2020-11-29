package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Risco;

@Repository
public interface RiscoRepository extends JpaRepository<Risco, Integer>{

}
