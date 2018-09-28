package com.jokerchen.pattern.structure.adapter;

/**
 * @author joker
 * @date 2018-09-27 21:05
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
