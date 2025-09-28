package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;
    public TimeSpan(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        if (hour<0){
            throw new IllegalArgumentException("Часы не могут быть отрицательными");
        }
        this.hour=hour;
     }
    public void setMinute(int minute){
        if (minute<0 || minute>=60){
            throw new IllegalArgumentException("Минуты должный быть от 0 до 59");
        }
        this.minute = minute;
    }
    public void setSecond(int second){
        if (second<0 || second>=60){
            throw new IllegalArgumentException("секунды должный быть от 0 до 59");
        }
    this.second = second;
    }
    public int toSecond(){
        return hour*3600+minute*60+second;
    }
    public void add(TimeSpan time){
        int totalSecond = this.toSecond()+time.toSecond();
        fromSecond(totalSecond);

    }
    public void fromSecond(int second){
        this.hour = second/3600;
        second = second%3600;
        this.minute = second/60;
        this.second = second%60;

    }
    public void subtract(TimeSpan time){
        int totalSecond = this.toSecond()- time.toSecond();
        fromSecond(totalSecond);
    }
    public String toString(){
        return "часы-"+ hour+"минуты"+ minute + "секунды" + second;
    }

}
