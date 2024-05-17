package com.alex.exception;

public class RegexValidationException extends RuntimeException{
    public RegexValidationException(String str, String regex) {
        super("Строка - " + str + " - не соотвует regex - " + regex);
    }
}
