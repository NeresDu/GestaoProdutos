package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Perecivel;

@Repository
public interface PerecivelRepository extends JpaRepository<Perecivel, Integer>{

}
