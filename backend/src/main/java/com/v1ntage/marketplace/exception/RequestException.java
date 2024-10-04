package com.v1ntage.marketplace.exception;


import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class RequestException extends RuntimeException {
    private String code;

    public RequestException(String code, String message){
        super(message);
        this.code = code;
    }
}
