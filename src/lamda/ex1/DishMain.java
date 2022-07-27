package lamda.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainDish {
    static List<Dish> menu = null;

    public static void initDish() {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
    }

    public static void main(String[] args) {
        initDish();

        //1. Find the dish which high calories
        List<Dish> highCalories = menu.stream().filter(d -> d.getCalories() > 500).collect(Collectors.toList());
        highCalories.forEach(System.out::println);
        System.out.println("---");

        // 2. Find the dish which is vegetarian
        List<Dish> vegetarianDish = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        vegetarianDish.forEach(System.out::println);
        System.out.println("---");

        // 3. Get all type of dish ( unique name)
        Set<String> typesDish = menu.stream().map(d -> d.getType().toString()).collect(Collectors.toSet());
        typesDish.forEach(System.out ::println);
        System.out.println("---");

        // 4.Get all name of dish type meat
        List<String> namesDishTypeMeat  = menu.stream()
                .filter(d -> d.getType().equals(Dish.Type.MEAT))
                .map(d -> d.getName()).collect(Collectors.toList());

        System.out.println(namesDishTypeMeat);
        System.out.println("---");






    }


}






