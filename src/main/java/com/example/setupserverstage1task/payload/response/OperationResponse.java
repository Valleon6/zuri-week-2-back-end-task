package com.example.setupserverstage1task.payload.response;

import com.example.setupserverstage1task.infrastructure.services.OperationEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationResponse {

    private String slackUsername;
    private OperationEnum operationEnum;
    private int result;


}
