// src/main/java/com/neoclass/repository/TurmaRepository.java
package com.neoclass.repository;

import com.neoclass.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
