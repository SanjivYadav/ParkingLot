package com.parkinglot.factory;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    Map<String, Object> registry;

    public ObjectRegistry(){
        registry = new HashMap<>();
    }

    public void register(String name, Object obj){
        registry.put(name, obj);
    }
    public Object get(String name){
        return registry.get(name);
    }
}
