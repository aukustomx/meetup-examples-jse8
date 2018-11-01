package io.augusto.blambdafunctionalinterfaces;

public class ImperativeRunnable {

    public static void main(String[] args) {


        //It's is so verbose
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in separated thread");
            }
        });

        thread.start();
        System.out.println("Running in " + Thread.currentThread().getName() + " thread");
    }
}
