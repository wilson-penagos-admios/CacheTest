package com.eventui.cachetest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymondgarcia
 */
public class Cache {
    
    private final Map<String, CacheObject> cache = new HashMap();

    public CacheObject get(String key) {
        return  cache.get(key);
    }

    public void put(String key, CacheObject valueToPut) {
        cache.put(key, valueToPut);
    }

    public CacheObject remove(String key) {
       return cache.remove(key);
    }

    public void invalidate() {
       cache.clear();
    }
    
}
