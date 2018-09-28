package com.jokerchen.pattern.behavior.observer;

/**
 * @author joker
 * @date 2018-09-25 21:38
 */
public class ObserverTest {

    public static void main(String[] args){
        ChatRoom chatRoom = new ChatRoom();

        Member member1 = new Member("张三");
        Member member2 = new Member("李四");
        Member member3 = new Member("张龙");
        Member member4 = new Member("赵虎");
        chatRoom.addObserver(member1);
        chatRoom.addObserver(member2);
        chatRoom.addObserver(member3);
        chatRoom.addObserver(member4);

        member4.sendMessage(chatRoom,"hello world!");
        member3.sendMessage(chatRoom,"hello java!");
    }
}
