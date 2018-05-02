package com.eventui.cachetest;

import org.junit.*;

import static org.junit.Assert.assertEquals;

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
    
    Cache cache;
    
    @Before
    public void setUp() {
        cache = new Cache();
    }
    
    @After
    public void tearDown() {
    }
    
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
