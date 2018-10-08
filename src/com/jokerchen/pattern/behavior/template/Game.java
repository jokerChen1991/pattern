package com.jokerchen.pattern.behavior.template;

/**
 * @Description: 模板模式，基类定于具体模板
 * @author joker
 * @date 2018-10-08 23:00
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
