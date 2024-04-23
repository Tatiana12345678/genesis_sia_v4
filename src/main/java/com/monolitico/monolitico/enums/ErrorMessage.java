package com.monolitico.monolitico.enums;
import lombok.Getter;
@Getter
public enum ErrorMessage {
    USER_NOT_FOUNT("User not found"),
    USER_EMAIL_EXISTS("The email is already registered");

    private final String message;
    ErrorMessage(String message){
        this.message=message;
    }

}
