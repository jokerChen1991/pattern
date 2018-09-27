package com.jokerchen.pattern.structural.adapter;

/**
 * @author joker
 * @date 2018-09-27 21:04
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

}
