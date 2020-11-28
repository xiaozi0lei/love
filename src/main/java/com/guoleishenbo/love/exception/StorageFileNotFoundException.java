package com.guoleishenbo.love.exception;

/**
 * @author GuoLei Sun
 * @date 2020/11/28 4:24 PM
 */
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
