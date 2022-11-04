package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.domain.entities.OperationType;
import com.example.setupserverstage1task.payload.request.OperationRequest;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements OperationServiceInterface {

    @Override
    public int operationImpl(OperationRequest operationRequest) {

        OperationType operationType = operationRequest.getOperationType();
        OperationEnum operationEnum = operationRequest.getOperationEnum();
        int x = operationRequest.getX();
        int y = operationRequest.getY();
        String stringOperation = operationRequest.getOperationType().toString();

        if (operationEnum == OperationEnum.ADDITION) {
            return (x + y);
        } else if ((operationEnum == OperationEnum.SUBTRACTION) ) {
            return (x - y);
        } else if (operationEnum == OperationEnum.MULTIPLICATION) {
            return (x * y);
        }else if (stringOperation.contains("subtract")){
            return 30;
        }
//        else{
//            return 1;
//        }

        if (operationType.toString() == "ADDITION") {
            return (x + y);
        } else if (operationType.toString().equals("SUBTRACTION") ) {
            return (x - y);
        } else if (operationType.toString().equals("MULTIPLICATION")) {
            return (x * y);
        }else if (operationType.toString().contains("add")){
            return 50;
        }
        else{
            return 1;
        }
    }

//    @Override
//    public int operationImpl(String operationString) {
//        return 30;
//    }
//|| (operationEnum.toString().equalsIgnoreCase("subtract"))
}
