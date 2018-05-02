/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventui.cachetest;

/**
 *
 * @author raymondgarcia
 */
interface CacheObject {

    void setValue(Object value);

    Object getValue();

    void setPriority(int priority);

    int getPriority();
    
}
