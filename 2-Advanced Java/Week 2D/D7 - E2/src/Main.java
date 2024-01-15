import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import logic.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        String input;
        String[] inputArr;
        String name;
        String description;
        LocalDate dueDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Task task;
        int index;
        int subIndex;
        boolean isDone;
        boolean isExit = false;

        Task task1 = new Task() {
            {
                setName("Task 1");
                setDescription("Task 1");
                setDueDate(LocalDate.now());
                setDone(false);
                setSubTasks(new ArrayList<Task>());
            }
        };

        Task sub1 = new Task() {
            {
                setName("Subtask");
                setDescription("Subtask");
                setDueDate(LocalDate.now());
                setDone(false);
                setSubTasks(new ArrayList<Task>());
            }
        };

        Task sub2 = new Task() {
            {
                setName("Subtask2");
                setDescription("Subtask2");
                setDueDate(LocalDate.now());
                setDone(false);
                setSubTasks(new ArrayList<Task>());
            }
        };

        Task task2 = new Task() {
            {
                setName("Task 2");
                setDescription("Task 2");
                setDueDate(LocalDate.now());
                setDone(false);
                setSubTasks(new ArrayList<Task>());
            }
        };

        Task sub3 = new Task() {
            {
                setName("Subtask3");
                setDescription("Subtask3");
                setDueDate(LocalDate.now());
                setDone(false);
                setSubTasks(new ArrayList<Task>());
            }
        };

        task1.addSubsTask(sub1);
        task1.addSubsTask(sub2);
        task2.addSubsTask(sub3);
        tasks.add(task1);
        tasks.add(task2);

        System.out.println("Welcome to Task Manager!");
        System.out.println("Type 'help' to see the list of commands.");

        while (!isExit) {
            System.out.print("Enter command: ");
            input = sc.nextLine();
            inputArr = input.split(" ", 2);

            switch (inputArr[0]) {
                case "help":
                    System.out.println("Commands:");
                    System.out.println("add <name> <description> <due date>");
                    System.out.println("addsub <index> <name> <description> <due date>");
                    System.out.println("delete <index>");
                    System.out.println("deletesub <index> <sub index>");
                    System.out.println("done <index>");
                    System.out.println("donesub <index> <sub index>");
                    System.out.println("list");
                    System.out.println("listsub <index>");
                    System.out.println("exit");
                    break;
                case "add":
                    if (inputArr.length < 2) {
                        System.out.println("Invalid command. Please try again.");
                        break;
                    }
                    inputArr = inputArr[1].split(" ", 3);
                    name = inputArr[0];
                    description = inputArr[1];
                    dueDate = LocalDate.parse(inputArr[2], formatter);
                    task = new Task(name, description, dueDate);
                    tasks.add(task);
                    System.out.println("Task added");
                    break;
                case "addsub":
                    if (inputArr.length < 2) {
                        System.out.println("Invalid command. Please try again.");
                        break;
                    }
                    inputArr = inputArr[1].split(" ", 4);
                    index = Integer.parseInt(inputArr[0]);
                    name = inputArr[1];
                    description = inputArr[2];
                    dueDate = LocalDate.parse(inputArr[3], formatter);
                    task = new Task(name, description, dueDate);
                    tasks.get(index).addSubsTask(task);
                    break;
                case "delete":
                    if (inputArr.length < 2) {
                        System.out.println("Invalid command. Please try again.");
                        break;
                    }
                    index = Integer.parseInt(inputArr[1]);
                    tasks.remove(index);
                    System.out.println("Task deleted");
                    break;

                case "done":

                    if (inputArr.length < 2) {
                        System.out.println("Invalid command. Please try again.");
                        break;
                    }
                    index = Integer.parseInt(inputArr[1]);
                    tasks.get(index).setDone(true);
                    System.out.println("Task marked as done");
                    break;
                case "donesub":

                    if (inputArr.length < 2) {
                        System.out.println("Invalid command. Please try again.");
                        break;
                    }
                    inputArr = inputArr[1].split(" ", 2);
                    index = Integer.parseInt(inputArr[0]);
                    subIndex = Integer.parseInt(inputArr[1]);
                    tasks.get(index).getSubTasks().get(subIndex).setDone(true);
                    System.out.println("Subtask marked as done");
                    break;
                case "list":
                    System.out.println("Tasks:");
                    for (Task element : tasks) {
                        element.printTask();
                    }
                    break;
                case "exit":
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;

            }

        }
        sc.close();
    }
}