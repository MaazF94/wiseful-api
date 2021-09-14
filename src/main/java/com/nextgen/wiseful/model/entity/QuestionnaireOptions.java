package com.nextgen.wiseful.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class QuestionnaireOptions {
    
    @Id
    @GeneratedValue
    private Long id;
    private String value;
    private int sectionNumber;
    
}
