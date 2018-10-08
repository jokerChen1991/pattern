package com.jokerchen.pattern.behavior.iterator;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:10
 */
public class IteratorTest {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iterator = namesRepository.iterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
