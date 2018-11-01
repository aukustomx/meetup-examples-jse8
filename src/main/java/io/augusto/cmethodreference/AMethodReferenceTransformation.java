package io.augusto.cmethodreference;

import java.util.function.Consumer;

public class AMethodReferenceTransformation {

    public static void main(String[] args) {

        //Anonymous class
        Consumer<String> printAnonymous = new Consumer<String>() {
            @Override
            public void accept(String text) {
                System.out.println(text);
            }
        };

        //Convert to Lambda
        //Text is the method's argument and its type is inferred from parameterized type
        //The return type is inferred from lambda's body, in this case void
        Consumer<String> printLambda = text -> System.out.println(text);

        //We know that this lambda expression is just a call to some method on System.out, println
        // and passing the lambda parameter to it.
        Consumer<String> print = System.out::println;
    }

}
