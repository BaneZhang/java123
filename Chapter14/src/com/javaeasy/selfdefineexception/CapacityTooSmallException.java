package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:08
 */
public class CapacityTooSmallException extends Exception {
    public CapacityTooSmallException(String message) {
        super(message);
    }
}
