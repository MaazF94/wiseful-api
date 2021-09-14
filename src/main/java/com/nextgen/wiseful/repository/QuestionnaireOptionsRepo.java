package com.nextgen.wiseful.repository;

import org.springframework.stereotype.Repository;
import com.nextgen.wiseful.model.entity.QuestionnaireOptions;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuestionnaireOptionsRepo extends JpaRepository<QuestionnaireOptions, Long> {
    
}
