package ua.edu.sumdu.j2se.Lampak.tasks;

public class ArrayTaskList extends Object {

    //public ArrayList arrayTaskList = new ArrayList(10);
    public Task[] arrayTaskList = new Task[10];

    public void add(Task task) {
        //arrayTaskList.add(task);

        Task[] newArray = new Task[10];
        int i;
        for (i = 0; i < arrayTaskList.length; i++)
            newArray[i] = arrayTaskList[i];
        newArray[i + 1] = task;
        arrayTaskList = newArray;

    }

    public boolean remove(Task task) {
//        if (arrayTaskList.contains(task)) {
//            arrayTaskList.remove(task);
//            return true;
//        }
//        return false;
        Task[] newArray = new Task[10];
        boolean boolToReturn = false;
        for (int i = 0; i < arrayTaskList.length; i++) {
            if (arrayTaskList[i] == task) {
                boolToReturn = true;
            } else {
                newArray[i] = arrayTaskList[i];
                boolToReturn = false;
            }
        }
        return boolToReturn;
    }

    public int size() {
//            return arrayTaskList.size();
        int size = 0;
        for (Task i : arrayTaskList)
            size = +1;
        return size;
    }

    public Task getTask(int index) {
        //return (Task) arrayTaskList.get(index);
        return (Task) arrayTaskList[index];
    }

    public ArrayTaskList[] incoming(int from, int to) {
//        ArrayTaskList listToReturn = new ArrayTaskList();
//        for (int i = 0; i < arrayTaskList.size(); i++) {
//            Task task = (Task) arrayTaskList.get(i);
//            if (task.isActive()) {
//                if (!task.isRepeated()) {
//                    if (task.getTime() > from) {
//                        listToReturn.add(task);
//                    }
//                } else {
//                    if (task.getStartTime() > from && task.getEndTime() < to) {
//                        listToReturn.add(task);
//                    }
//                }
//            }
//        }
//        return listToReturn;
//    }
        ArrayTaskList[] listToReturn = new ArrayTaskList[10];
        for (int i = 0; i < arrayTaskList.length; i++) {
            Task task = (Task) arrayTaskList[i];
            if (task.isActive()) {
                if (!task.isRepeated()) {
                    if (task.getTime() > from) {
                        listToReturn.add(task);

//                        Task[] newArray = new Task[10];
//                        int n = 0;
//                        for (n = 0; n < arrayTaskList.length; n++)
//                            newArray[n] = arrayTaskList[n];
//                        newArray[n + 1] = task;
//                        listToReturn = newArray;

                    }
                } else {
                    if (task.getStartTime() > from & task.getEndTime() < to) {
                        listToReturn.add(task);

//                        Task[] newArray = new Task[10];
//                        int n = 0;
//                        for (n = 0; n < arrayTaskList.length; n++)
//                            newArray[n] = arrayTaskList[n];
//                        newArray[n + 1] = task;
//                        listToReturn = newArray;
                    }
                }
            }
        }
        return listToReturn;
    }
}
