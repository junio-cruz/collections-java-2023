package todo;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<Task>();
    }

    public void addTask(String description) {
        this.taskList.add(new Task(description));
    }

    public List<Task> removeTask(String description) {
        List<Task> response = new ArrayList<Task>();
        for (Task t: this.taskList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                response.add(t);
            }
        }
        this.taskList.removeAll(response);
        return this.taskList;
    }

    public int getTotalTasks() {
        return this.taskList.size();
    }

    public void getTasksDescription() {
        System.out.println("TASKS LIST! " + taskList);
    }
}
