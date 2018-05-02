package com.eventui.cachetest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymondgarcia
 */
public class Chache {
    
    Map<String, CacheObject> cache;

    public Chache() {
        cache = new HashMap();
    }
    
    
    CacheObject get(String key) { return  cache.get(key); }

    void put(String key, CacheObject valueToPut) {
        cache.put(key, valueToPut);
    }

    CacheObject remove(String key) {
       return cache.remove(key);
    }

    void invalidate() {
       cache.clear();
    }
    
}
