import models.Call;
import models.Operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Queue<Call> calls = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < 1000; i++) {
            calls.add(new Call("Name " + i, "Number " + i + 1000));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Operator> operators = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Operator operator = new Operator(i, calls);
            operators.add(operator);
            executorService.execute(operator);
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All calls have been managed");

    }
}
