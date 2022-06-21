package supplier.ex1;

import java.util.function.Supplier;

public class Supplier_1_Main {
    public static void main(String[] args) {


        // Supplier use lambda expression

        Supplier<String> supplier = () -> "Welcome to gpcoder.com";
        String message = supplier.get();
        System.out.println(message);
    }
}
