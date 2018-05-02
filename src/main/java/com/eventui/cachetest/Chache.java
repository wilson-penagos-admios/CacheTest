/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventui.cachetest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymondgarcia
 */
public class Chache {
    
    Map cache;

    public Chache() {
        cache = new HashMap();
    }
    
    
    CacheObject get(String key) {
       return (PriorityCache) cache.get(key);
    }

    void put(String key, CacheObject valueToPut) {
        cache.put(key, valueToPut);
    }

    CacheObject remove(String key) {
       return (PriorityCache) cache.remove(key);
    }

    void invalidate() {
       cache.clear();
    }
    
}
