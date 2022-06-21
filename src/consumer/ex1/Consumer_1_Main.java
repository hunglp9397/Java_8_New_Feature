package consumer.ex1;

import java.util.function.Consumer;

public class Consumer_1_Main {

    public static void printValue(int val){
        System.out.println(val);
    }

    public static void main(String[] args){

        // Create Consumer interface with lambda expression
        Consumer<String> consumer_1 = s -> System.out.println("Hello " + s);

        // Create consumer interface with method reference
        Consumer<Integer> consumer_2 = Consumer_1_Main::printValue;

        //Call Consumer method
        consumer_1.accept("Hung");

        consumer_2.accept(2);
    }


}
