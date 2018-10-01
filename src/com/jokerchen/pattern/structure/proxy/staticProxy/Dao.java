package com.jokerchen.pattern.structure.proxy.staticProxy;

/**
 * @author joker
 * @date 2018-10-01 13:24
 */
public class Dao implements IDao{

    @Override
    public void save(){
        System.out.println("保存数据。。。");
    }
}
