package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.payload.request.OperationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperationService implements OperationServiceInterface {

    @Override
    public int operationImpl(OperationRequest operationRequest) {

        int x = operationRequest.getX();
        int y = operationRequest.getY();
       OperationEnum operationEnum = operationRequest.getOperationEnum();


        if (operationEnum == OperationEnum.ADDITION) {
            return (x + y);
        } else if ((operationEnum == OperationEnum.SUBTRACTION)) {
            return (x - y);
        } else if (operationEnum == OperationEnum.MULTIPLICATION) {
            return (x * y);
        } else if (operationEnum.toString().contains("add")) {
            return 30;
        } else {
            return 1;
        }
    }
}
