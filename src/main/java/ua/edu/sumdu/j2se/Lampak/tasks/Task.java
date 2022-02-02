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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTime() {
        if (repeated)
            return startTime;
        else
            return time;
    }

    public void setTime(int time) {
        this.time = time;
        if (repeated)
            this.repeated = false;
    }

    public int getStartTime() {
        if (repeated)
            return startTime;
        else
            return time;
    }

    public int getEndTime() {
        if (repeated)
            return endTime;
        else
            return time;
    }

    public int getRepeatInterval() {
        if (repeated)
            return interval;
        else
            return 0;
    }

    public void setTime(int start, int end, int interval) {
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
        if (!repeated)
            this.repeated = true;
    }

    public boolean isRepeated() {
        return repeated;
    }

    public int nextTimeAfter(int current) {
        int nextTime = startTime;
        while (nextTime >= current) {
            nextTime += interval;
        }
        if (nextTime > endTime)
            return -1;
        else
            return nextTime;
    }
//comment
}
