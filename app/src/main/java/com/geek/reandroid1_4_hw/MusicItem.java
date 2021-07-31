package com.geek.reandroid1_4_hw;

import android.widget.TextView;

public class MusicItem {

    private String num, song, name, time;

    public MusicItem(String num, String song, String name, String time) {
        this.num = num;
        this.song = song;
        this.name = name;
        this.time = time;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
