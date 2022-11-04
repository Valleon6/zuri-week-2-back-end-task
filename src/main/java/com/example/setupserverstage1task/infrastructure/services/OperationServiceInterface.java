package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.payload.request.OperationRequest;

public interface OperationServiceInterface {

    int operationImpl(OperationRequest operationRequest);
//    int operationImpl(String operationString);

//    int operationImpl(OperationEnum operationEnum, int x, int y);
}
