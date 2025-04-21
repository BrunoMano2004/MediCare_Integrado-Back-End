package br.com.medicare.integrado.repository;

import br.com.medicare.integrado.model.CheckInOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckInOutRepository extends JpaRepository<CheckInOut, UUID> {
}
