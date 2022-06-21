package consumer.ex2;

import java.util.function.BiConsumer;

public class BiConsumer_Main {

    public static void printValue(int value1, int value2){
        System.out.println(value1 + " " + value2);
    }

    public static void main(String[] args) {

        // Create BiConsumer interface using lambda expression
        BiConsumer<Integer, Integer> consumer_1 = (num1, num2) -> System.out.println(num1 + " " + num2);

        // Create BiConsumer interface use method reference
        BiConsumer<Integer,Integer> consumer_2 = BiConsumer_Main::printValue;

        consumer_1.accept(1,2);

        consumer_2.accept(100,200);



    }
}
