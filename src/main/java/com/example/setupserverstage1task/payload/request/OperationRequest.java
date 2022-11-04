package com.example.setupserverstage1task.payload.request;

import com.example.setupserverstage1task.infrastructure.services.OperationEnum;
import lombok.*;

@Getter
@Setter

public class OperationRequest {

    private OperationEnum operationEnum;
    private int x;
    private int y;

    public OperationRequest(OperationEnum operationEnum, int x, int y) {
        this.operationEnum = operationEnum;
        this.x = x;
        this.y = y;
    }

    public OperationRequest(OperationEnum operationEnum) {
        this.operationEnum = operationEnum;
    }
}
