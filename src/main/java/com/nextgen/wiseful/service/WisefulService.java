package com.nextgen.wiseful.service;

import java.util.List;

import com.nextgen.wiseful.model.entity.QuestionnaireOptions;
import com.nextgen.wiseful.repository.QuestionnaireOptionsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WisefulService {

    @Autowired
    QuestionnaireOptionsRepo questionnaireOptionsRepo;

    public List<QuestionnaireOptions> getQuestionnaireOptions() {
        return questionnaireOptionsRepo.findAll();
    }
    
}
