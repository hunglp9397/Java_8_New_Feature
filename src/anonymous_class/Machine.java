package anonymous_class;

import java.util.Locale;

public class Machine {
    public static void main(String[] args) {
        // Normal handle
       // System.out.println(process("hello"))


        // Apply Anonymous function:
        System.out.println(getStr("Hello Loda!", new StringProcessor() {
            @Override
            public String process(String input) {
                return input.toUpperCase();
            }
        }));

        System.out.println(getStr("Hello Loda!", new StringProcessor() {
            @Override
            public String process(String input) {
                return input.toLowerCase();
            }
        }));


    }

    // Declare Anonymous function:
    public static String getStr(String input, StringProcessor processor){
        return processor.process(input);

    }


    public static String process(String input){
        return input.toUpperCase();
    }
}

interface StringProcessor{
    public String process(String input);
}
