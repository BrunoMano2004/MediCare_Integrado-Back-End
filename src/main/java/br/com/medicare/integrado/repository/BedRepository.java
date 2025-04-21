package br.com.medicare.integrado.repository;

import br.com.medicare.integrado.model.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BedRepository extends JpaRepository<Bed, UUID> {
}
