package ua.edu.sumdu.j2se.Lampak.tasks;

public class Task {

    public String title;
    public boolean active;
    public boolean repeated;
    public int time;
    public int startTime;
    public int endTime;
    public int interval;

    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    boolean isActive() {
        return active;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    int getTime() {
        return time;
    }

    void setTime(int time) {
        this.time = time;
    }

    int getStartTime() {
        return startTime;
    }

    int getEndTime() {
        return endTime;
    }

    int getRepeatInterval() {
        return interval;
    }

    void setTime(int start, int end, int interval) {
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
    }

    boolean isRepeated() {
        return repeated;
    }

//adding some comment

}