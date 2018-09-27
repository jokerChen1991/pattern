package com.jokerchen.pattern.structural.composite;

import java.util.List;

/**
 * @author joker
 * @date 2018-09-27 22:47
 */
public class Organization {

    private String name;

    private List<Organization> subordinate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Organization> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<Organization> subordinate) {
        this.subordinate = subordinate;
    }
}
