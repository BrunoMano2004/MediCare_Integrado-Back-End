package br.com.medicare.integrado.repository;

import br.com.medicare.integrado.model.ExamType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExamTypeRepository extends JpaRepository<ExamType, UUID> {
}
