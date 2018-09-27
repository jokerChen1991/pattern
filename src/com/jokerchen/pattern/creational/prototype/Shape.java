package com.jokerchen.pattern.creational.prototype;

/**
 * 必须实现{@link java.lang.Cloneable}否则在中clone的时候会报错
 * @author joker
 * @date 2018-09-27 20:44
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
