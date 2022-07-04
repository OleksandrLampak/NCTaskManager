package ua.edu.sumdu.j2se.Lampak.tasks;

import java.util.Iterator;

public abstract class AbstractTaskList implements Iterable<Task> {

//    int size = 0;

    public abstract void add(Task task);

    public abstract boolean remove(Task task);

    public abstract int size();

    public abstract Task getTask(int index);

    public AbstractTaskList incoming(int from, int to) {
        Iterator<Task> iterator = this.iterator();
        while (iterator.hasNext()){
            Task task = iterator.next();
            //
            //
        }


        AbstractTaskList listToReturn = new AbstractTaskList();
        return listToReturn;
    }

}
