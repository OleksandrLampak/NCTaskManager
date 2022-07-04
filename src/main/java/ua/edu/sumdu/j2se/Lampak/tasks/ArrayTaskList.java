package ua.edu.sumdu.j2se.Lampak.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class ArrayTaskList extends AbstractTaskList {

    private Task[] arrayTask = new Task[10];
    private int size = 0;

    public void add(Task task) {
        if (arrayTask[arrayTask.length - 1] != null) {
            Task[] newArray = new Task[arrayTask.length * 2];
            int i;
            for (i = 0; i < arrayTask.length; i++) {
                newArray[i] = arrayTask[i];
            }
            newArray[i + 1] = task;
            arrayTask = newArray;
        } else {
            for (int i = 0; i < arrayTask.length; i++)
                if (arrayTask[i] == null) {
                    arrayTask[i] = task;
                    break;
                }
        }
        size++;
    }

    public boolean remove(Task task) {
        boolean boolToReturn = false;
        int indexForNull = 0;
        for (int i = 0; i < arrayTask.length; i++) {
            if (arrayTask[i] == task) {
                boolToReturn = true;
                indexForNull = i;
                break;
            }
        }
        if (boolToReturn) {
            for (int i = indexForNull+1; i < arrayTask.length; i++) {
                arrayTask[i-1] = arrayTask[i];
            }
            size--;
        }
        return boolToReturn;
    }

    public int size() {
        return size;
    }

    public Task getTask(int index) {
        return arrayTask[index];
    }

    public ArrayTaskList incoming(int from, int to) {
        ArrayTaskList listToReturn = new ArrayTaskList();
        for (int i = 0; i < size; i++) {
            Task task = arrayTask[i];
            if (task.isActive()) {
                if (!task.isRepeated()) {
                    if (task.getTime() > from) {
                        listToReturn.add(task);
                    }
                } else {
                    if (task.getStartTime() > from & task.getEndTime() < to) {
                        listToReturn.add(task);
                    }
                }
            }
        }
        return listToReturn;
    }

    @NotNull
    @Override
    public Iterator<Task> iterator() {
        return new Iterator<Task>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Task next() {
                return null;
            }2+1+
        };
    }
}







