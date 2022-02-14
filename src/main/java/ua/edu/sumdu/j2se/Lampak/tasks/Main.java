package ua.edu.sumdu.j2se.Lampak.tasks;

import ua.edu.sumdu.j2se.Lampak.tasks.exceptions.TaskException;

public class Main {

    public static void main(String[] args) throws TaskException {

        Task myTask = new Task("My first task", -4, 5, 1);


/*
		myTask.setTitle("Morning alarm clock");
		myTask.setActive(true);
		myTask.setTime(myTask.getStartTime(), myTask.getEndTime(), 2);

*/
		System.out.println(myTask.getTitle());
		System.out.println("Active: "+myTask.isActive());
		System.out.println("Repeated: "+myTask.isRepeated());
		System.out.println("Interval: "+myTask.getRepeatInterval());

    }
}
