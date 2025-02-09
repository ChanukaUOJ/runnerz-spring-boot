package com.runnerz_spring_boot.runnerz.Run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFountException extends RuntimeException{
    public RunNotFountException(){
        super("Run Not Found!");
    }

}
