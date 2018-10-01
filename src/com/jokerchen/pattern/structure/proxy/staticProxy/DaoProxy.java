package com.jokerchen.pattern.structure.proxy.staticProxy;

/**
 * 静态代理
 * @author joker
 * @date 2018-10-01 13:25
 */
public class DaoProxy implements IDao {

    private Dao target;

    public DaoProxy(Dao dao){
        this.target = dao;
    }

    @Override
    public void save(){
        System.out.println("开启事务");
        target.save();
        System.out.println("提交事务");
    }
}
