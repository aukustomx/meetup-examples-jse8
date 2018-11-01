package io.augusto.blambdafunctionalinterfaces;

public class FunctionalRunnable {

    public static void main(String[] args) {

        //How the inference happens. The return type is inferred from the body of lambda
        Thread thread = new Thread(() -> System.out.println("Running in separated thread"));

        thread.start();
        System.out.println("Running in main thread");
    }
}
