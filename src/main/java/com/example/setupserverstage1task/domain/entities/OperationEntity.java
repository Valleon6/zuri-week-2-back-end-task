package com.example.setupserverstage1task.domain.entities;

import com.example.setupserverstage1task.infrastructure.services.OperationEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationEntity {

    private OperationEnum operationEnum;
    private int x;
    private int y;


}
