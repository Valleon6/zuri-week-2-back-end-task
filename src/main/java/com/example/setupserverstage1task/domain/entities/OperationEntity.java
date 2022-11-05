package com.example.setupserverstage1task.domain.entities;

import com.example.setupserverstage1task.infrastructure.services.Operation_Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationEntity {

    private Operation_Type operationType;
    private int x;
    private int y;


}
