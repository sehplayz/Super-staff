package me.sehplayz.exception;

/**
 * Created by sehplayz.
 */
public class ErrorException extends Exception {

    private String message;

    public ErrorException(String msg) {
        this.message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
