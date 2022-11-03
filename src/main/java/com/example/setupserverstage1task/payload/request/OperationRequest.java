package com.example.setupserverstage1task.payload.request;

import com.example.setupserverstage1task.infrastructure.services.OperationEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class OperationRequest {
    private OperationEnum operationEnum;
    private int x;
    private int y;


}
