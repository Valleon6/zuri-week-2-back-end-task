package com.example.setupserverstage1task.payload.request;

import com.example.setupserverstage1task.domain.entities.OperationType;
import com.example.setupserverstage1task.infrastructure.services.OperationEnum;
import lombok.*;

@Getter
@Setter
public class OperationRequest {

    private OperationType operationType;
    private OperationEnum operationEnum;
    private int x;
    private int y;

    public OperationRequest(OperationType operationType, int x, int y) {
        this.operationType = operationType;
        this.x = x;
        this.y = y;
    }

    public OperationRequest(OperationEnum operationEnum, int x, int y) {
        this.operationEnum = operationEnum;
        this.x = x;
        this.y = y;
    }

    public OperationRequest(OperationEnum operationEnum) {
        this.operationEnum = operationEnum;
    }

    public OperationRequest(OperationType operationType) {
        this.operationType = operationType;
    }
}
