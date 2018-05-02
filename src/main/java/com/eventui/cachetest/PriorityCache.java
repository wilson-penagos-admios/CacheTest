package com.eventui.cachetest;

import java.util.Objects;

/**
 *
 * @author raymondgarcia
 */
public class PriorityCache implements CacheObject {
    
    private Object value;
    private int priority;

    public PriorityCache(Object value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public PriorityCache() {
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.value);
        hash = 53 * hash + this.priority;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof PriorityCache) || ((PriorityCache) obj).priority != this.priority || ((PriorityCache) obj).value != this.value) return false;
        return true;
    }

}
