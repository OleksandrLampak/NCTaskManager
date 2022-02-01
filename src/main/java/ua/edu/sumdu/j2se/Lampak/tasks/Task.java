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
        this.active = false;
        this.repeated = false;
    }

    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
        this.active = false;
        this.repeated = true;

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
        if (repeated)
            return startTime;
        else
            return time;
    }

    void setTime(int time) {
        this.time = time;
        if (repeated)
            this.repeated = false;
    }

    int getStartTime() {
        if (repeated)
            return startTime;
        else
            return time;
    }

    int getEndTime() {
        if (repeated)
            return endTime;
        else
            return time;
    }

    int getRepeatInterval() {
        if (repeated)
            return interval;
        else
            return 0;
    }

    void setTime(int start, int end, int interval) {
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
        if (!repeated)
            this.repeated = true;
    }

    boolean isRepeated() {
        return repeated;
    }

}
