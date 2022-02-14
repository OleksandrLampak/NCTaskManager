package ua.edu.sumdu.j2se.Lampak.tasks;

import ua.edu.sumdu.j2se.Lampak.tasks.exceptions.TaskException;

public class Task {

    private String title;
    private boolean active;
    private boolean repeated;
    private int time;
    private int startTime;
    private int endTime;
    private int interval;

    public Task(String title, int time) throws TaskException {
        if (title.isBlank()) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'title': is empty", e);
            }
        }

        if (time < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'time': " + time, e);
            }
        }
        this.title = title;
        this.time = time;
        this.active = false;
        this.repeated = false;
    }

    public Task(String title, int start, int end, int interval) throws TaskException {
        if (start < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'start': " + start, e);
            }
        }
        if (end < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'end': " + end, e);
            }
        }
        if (interval < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'interval': " + interval, e);
            }
        }
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

    public void setTitle(String title) throws TaskException {
        if (title.isBlank()) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'title': is empty", e);
            }
        }
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

    public void setTime(int time) throws TaskException {
        if (time < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new TaskException("Program fault, incorrect 'time': " + time, e);
            }
        }
        this.time = time;
        if (repeated)
            this.repeated = false;
    }

    public int getStartTime () {
            if (repeated)
                return startTime;
            else
                return time;
        }

        public int getEndTime () {
            if (repeated)
                return endTime;
            else
                return time;
        }

        public int getRepeatInterval () {
            if (repeated)
                return interval;
            else
                return 0;
        }

        public void setTime ( int start, int end, int interval){
            this.startTime = start;
            this.endTime = end;
            this.interval = interval;
            if (!repeated)
                this.repeated = true;
        }

        public boolean isRepeated () {
            return repeated;
        }

        public int nextTimeAfter ( int current){
            if (!active)
                return -1;
            else {
                if (!repeated)
                    if (time > current)
                        return time;
                    else
                        return -1;
                else {
                    int nextTime = startTime;

                    while (nextTime <= current) {
                        nextTime += interval;
                    }
                    if (nextTime > endTime)
                        return -1;
                    else
                        return nextTime;
                }
            }
        }
    }
