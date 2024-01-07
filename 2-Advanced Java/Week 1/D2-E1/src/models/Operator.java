package models;

import java.util.List;
import java.util.Queue;

public class Operator extends Thread implements Runnable{

    private int id;
    private Queue<Call> calls;
    public Operator(int id, Queue<Call> calls) {
        this.id = id;
        this.calls = calls;
    }

    public void manageCall(Call call) {
        System.out.println("Operator " + id + " is managing call " + call.getNumber() + " from " + call.getName());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operator " + id + " finished managing call " + call);
    }

    @Override
    public void run() {
        while (!calls.isEmpty()) {
            manageCall(calls.poll());
        }
    }
}
