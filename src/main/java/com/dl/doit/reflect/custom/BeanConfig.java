package com.dl.doit.reflect.custom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanConfig {

    private String id;
    private String clazz;
    private String factoryMethod;
    private String factoryBean;

    private Map<String, List<String>> constructorHashMap = new HashMap<>();
    private Map<String, List<String>> propertyHashMap = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getFactoryMethod() {
        return factoryMethod;
    }

    public void setFactoryMethod(String factoryMethod) {
        this.factoryMethod = factoryMethod;
    }

    public String getFactoryBean() {
        return factoryBean;
    }

    public void setFactoryBean(String factoryBean) {
        this.factoryBean = factoryBean;
    }

    public Map<String, List<String>> getConstructorHashMap() {
        return constructorHashMap;
    }

    public void setConstructorHashMap(Map<String, List<String>> constructorHashMap) {
        this.constructorHashMap = constructorHashMap;
    }

    public Map<String, List<String>> getPropertyHashMap() {
        return propertyHashMap;
    }

    public void setPropertyHashMap(Map<String, List<String>> propertyHashMap) {
        this.propertyHashMap = propertyHashMap;
    }
}
