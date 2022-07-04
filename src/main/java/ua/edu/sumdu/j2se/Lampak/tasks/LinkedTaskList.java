package ua.edu.sumdu.j2se.Lampak.tasks;

public class LinkedTaskList extends AbstractTaskList {

    private Node first;
    private Node last;
    private int size;

    static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void add(Task task) {
        Node newNode = new Node(task);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public boolean remove(Task task) {
        boolean boolToReturn = false;
        if (size != 0) {
            Node current = first;
            Node prev = null;
            while (current != null) {
                if (task == current.task) {
                    if (current == first) {
                        current = first.next;
                        first = first.next;
                        if (first == null) {
                            last = null;
                        }
                        current = null;
                    } else if (current == last) {
                        last = prev;
                        last.next = null;
                        current = null;
                    } else {
                        prev.next = current.next;
                        current = current.next;
                        current = null;
                    }
                    boolToReturn = true;
                    size--;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }
        return boolToReturn;
    }

    public int size() {
        return size;
    }

    public Task getTask(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.task;
    }

    public LinkedTaskList incoming(int from, int to) {
        LinkedTaskList listToReturn = new LinkedTaskList();
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.task.isActive()) {
                if (!current.task.isRepeated()) {
                    if (current.task.getTime() > from) {
                        listToReturn.add(current.task);
                    }
                } else {
                    if (current.task.getStartTime() > from & current.task.getEndTime() < to) {
                        listToReturn.add(current.task);
                    }
                }
            }
            current = current.next;
        }
        return listToReturn;
    }
}






