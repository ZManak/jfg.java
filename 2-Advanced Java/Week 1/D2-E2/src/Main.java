import models.Operator;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        int numOperators = 15;
        Operator[] operators = new Operator[numOperators];
        for (int i = 0; i < numOperators; i++) {
            operators[i] = new Operator("Operator " + i);
        }
        ExecutorService executor = Executors.newFixedThreadPool(numOperators);
        for (Operator operator : operators) {
            executor.execute(operator);
        }
        executor.shutdown();

    }
}
