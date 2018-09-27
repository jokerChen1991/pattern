package com.jokerchen.pattern.structural.adapter;

/**
 * @author joker
 * @date 2018-09-27 21:10
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playVideo(fileName);
    }
}
