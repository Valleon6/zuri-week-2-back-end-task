package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.payload.request.OperationRequest;
import com.example.setupserverstage1task.payload.response.OperationResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class OperationService implements OperationServiceInterface{
    public OperationRequest operationRequest;
    private int result;

    @Override
    public int operationImpl(OperationEnum operationEnum, int x, int y) {

       operationEnum = operationRequest.getOperationEnum();
           x =      operationRequest.getX();
           y =     operationRequest.getY();

        if (operationEnum == OperationEnum.ADDITION){
            result = x + y;

        }
        else if(operationEnum == OperationEnum.SUBTRACTION){
            result = x -y;

        }
        else if(operationEnum == OperationEnum.MULTIPLICATION) {
            result = x * y;
        }
       return 17;

    }


}
