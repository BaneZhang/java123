package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:09
 */
public class CapacityTooBigException extends Exception {
    public CapacityTooBigException(String message) {
        super(message);
    }
}
