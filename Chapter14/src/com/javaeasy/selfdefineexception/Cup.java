package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:10
 */
public class Cup {
    private int capacity;

    public void setCapacity(int capacity) throws CapacityTooSmallException, CapacityTooBigException {
        if (capacity > 10000) {
            CapacityTooBigException tooBigException = new CapacityTooBigException("杯子的容积不能超过10000：" + capacity);
            throw tooBigException;
        } else if (capacity < 0) {
            CapacityTooSmallException tooSmallException = new CapacityTooSmallException("杯子的容积不能小于0：" + capacity);
            throw tooSmallException;
        }

        this.capacity = capacity;
    }
}
