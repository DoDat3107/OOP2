package bai3jame;

public class Stopwatch {
    private long startTime;
    private long stopTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return stopTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stopTime - startTime;
    }
}
