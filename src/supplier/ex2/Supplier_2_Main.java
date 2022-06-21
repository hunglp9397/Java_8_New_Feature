package supplier.ex2;

import java.util.function.Supplier;

public class Supplier_2_Main {
    public static void main(String[] args) {

        Supplier<Program> supplier_1 = Program::new;

        System.out.println(supplier_1.get());

        Supplier<String> supplier_2 = Program::getDefaultLanguage;

        System.out.println(supplier_2.get());

    }
}
