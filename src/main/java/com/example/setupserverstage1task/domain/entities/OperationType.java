package com.example.setupserverstage1task.domain.entities;

public class OperationType<T> {

    private T operationType;

    public OperationType(T operationType) {
        this.operationType = operationType;
    }

    public T getOperationType() {
        return operationType;
    }

    public void setOperationType(T operationType) {
        this.operationType = operationType;
    }

}
