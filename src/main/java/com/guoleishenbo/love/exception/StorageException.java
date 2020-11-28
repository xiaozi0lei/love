package com.guoleishenbo.love.exception;

/**
 * @author GuoLei Sun
 * @date 2020/11/28 4:24 PM
 */
public class StorageException extends RuntimeException {
    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
