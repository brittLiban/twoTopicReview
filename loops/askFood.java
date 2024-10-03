package loops;

import java.util.*;


public class askFood {
    public static void main(String[] args) {
        Map<String, Integer> foodTray = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        foodChecker(scanner, foodTray);

        scanner.close();
    }


    public static void foodChecker(Scanner input, Map<String, Integer> foodTray){
        System.out.println("Name a unique food");
        System.out.println();
        String userFood = input.nextLine().toLowerCase();
        

        if (!foodTray.containsKey(userFood)) {
            foodTray.put(userFood, 1);
            System.out.println("Wow, a unique addition");
            System.out.println();
        }
        else {
            foodTray.put(userFood, foodTray.get(userFood) + 1);
            System.out.println("This has already been said :" + foodTray.get(userFood) + " times...");
            System.out.println("You failed the challange");
            System.out.println();
        };

        System.out.println("The current unique food items"
        + foodTray
        );
        System.out.println();
    }
}
