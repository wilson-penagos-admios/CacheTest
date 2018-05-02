package com.eventui.cachetest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raymondgarcia
 */
public class CacheTest {
    
    public CacheTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    Chache cache;
    
    @Before
    public void setUp() {
        cache = new Chache();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void getObject() {
        Object result = cache.get("key");
        Object expected = null;
        assertEquals(result, expected);
    }
    
    @Test
    public void insertandRetriveObject(){
        String key = "key";
        CacheObject valueToPut = new PriorityCache("value", 0);
        cache.put( key,  valueToPut);  
        CacheObject result = cache.get("key");
        assertEquals(result, valueToPut);    
    }
    
    @Test
    public void removeAndObject(){
        String key = "key";
        CacheObject valueToPut = new PriorityCache("value", 0);
        cache.put( key,  valueToPut);  
        CacheObject result = cache.remove(key);  
        assertEquals(result, valueToPut);         
    }
    
    @Test
    public void removeAndObjectAndFindIt(){
        String key = "key";
        CacheObject valueToPut = new PriorityCache("value", 0);
        
        cache.put( key,  valueToPut); 
        
        CacheObject result = cache.remove(key);  
        assertEquals(result, valueToPut);  
       
        result =  cache.get(key);
        assertEquals(result, null);   
    }
    
    @Test
    public void invalidateCache(){   
        
        cache.put( "key",  new PriorityCache("value", 0)); 
        cache.put( "key1", new PriorityCache("value", 0)); 
        cache.put( "key2", new PriorityCache("value", 0)); 
        
        cache.invalidate(); 
        
        CacheObject result = cache.get("key");
        assertEquals(result, null);  
       
        result = cache.get("key1");
        assertEquals(result, null);
        
        result = cache.get("key2");
        assertEquals(result, null);
               
    }
    
    @Test
    public void ChacheObject() {
        CacheObject object = new PriorityCache();
        
        Object value  = null;
        object.setValue(value);
        
        assertEquals(value, object.getValue());
        
        int priority = 1;
        object.setPriority(priority);
        
        assertEquals(priority, object.getPriority());     
    }

    
    
    
    
}
