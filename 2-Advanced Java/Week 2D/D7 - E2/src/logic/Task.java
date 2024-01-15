package logic;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task {
    private String name;
    private String description;
    private LocalDate dueDate;
    private ArrayList<Task> subTasks;
    private boolean isDone;

    public Task() {

    }

    public Task(String name, String description, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isDone = false;
        this.subTasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    public void addSubsTask(Task task) {
        this.subTasks.add(task);
        System.out.println("Subtask added");
    }

    public void removeSubTask(Task task) {
        this.subTasks.remove(task);
        System.out.println("Subtask removed");
    }

    public ArrayList<Task> getSubTasks() {
        return this.subTasks;
    }

    public void setSubTasks(ArrayList<Task> subTasks) {
        this.subTasks = subTasks;
    }

    // Prints the task and its subtasks recursively

    public void printTask(int level, boolean showSubTasks) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += "|____ ";
        }
        System.out.println(indent + this.name);
        printTaskInfo();
        if (showSubTasks) {
            for (Task task : this.subTasks) {
                task.printTask(level + 1, showSubTasks);
            }
        }
    }

    public void printTask() {
        printTask(0, true);
    }

    public void printTaskInfo() {
        System.out.println("Task: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Due date: " + this.dueDate);
        System.out.println("Status: " + (this.isDone ? "Done" : "Not done"));
    }
}
