package lamda.ex1;

import java.util.Locale;

public class Machine {
    public static void main(String[] args) {

        // Apply anonymous function, use lamda
        System.out.println(getStr("hello", input -> input.toUpperCase()));


        // Apply anonymous function, use method reference
        System.out.println(getStr("le phi hung", String::toUpperCase));

    }

    //Declare anonymous function
    public static String getStr(String input , StringProcessor stringProcessor){
        return stringProcessor.process(input);
    }
}


interface StringProcessor{
    String process(String input);
}