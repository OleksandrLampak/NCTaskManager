package ua.edu.sumdu.j2se.Lampak.tasks;

import java.util.ArrayList;

public class ArrayTaskList {

    public ArrayList arrayTaskList = new ArrayList(10);

    public void add(Task task) {
        arrayTaskList.add(task);
    }

    public boolean remove(Task task) {
        if (arrayTaskList.contains(task)) {
            arrayTaskList.remove(task);
            return true;
        }
        return false;
    }

    public int size() {
        return arrayTaskList.size();
    }

    public Task getTask(int index) {
        return (Task) arrayTaskList.get(index);
    }

    public ArrayTaskList incoming(int from, int to) {

        ArrayTaskList listToReturn = new ArrayTaskList();
        for (int i = 0; i < arrayTaskList.size(); i++) {
            Task task = (Task) arrayTaskList.get(i);
            if (task.isActive()) {
                if (!task.isRepeated()) {
                    if (task.getTime() > from) {
                        listToReturn.add(task);
                    }
                } else {
                    if (task.getStartTime() > from && task.getEndTime() < to) {
                        listToReturn.add(task);
                    }
                }
            }
        }
        return listToReturn;
    }
}
