package com.nextgen.wiseful.controller;

import java.util.List;

import com.nextgen.wiseful.model.entity.QuestionnaireOptions;
import com.nextgen.wiseful.service.WisefulService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wiseful/v2")
public class WisefulController {

    @Autowired
    WisefulService wisefulService;

    @GetMapping("/options")
    public ResponseEntity<List<QuestionnaireOptions>> getQuestionnaireOptions() {

        List<QuestionnaireOptions> questionnaireOptions = wisefulService.getQuestionnaireOptions();
        return new ResponseEntity<>(questionnaireOptions, HttpStatus.OK);
    }
    
}
