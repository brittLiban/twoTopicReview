package instances;

import java.util.Scanner;

public class sportDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        sportConstructor(input);

    }


    public static void sportConstructor(Scanner in){
       System.out.println("What is your name?");
       String userName = in.nextLine();
       System.out.println("What is your favorite sport?");
       String userSport = in.nextLine().toLowerCase();
       
       Sport newSport = new Sport(userName, userSport);
       System.out.println(newSport);
       
    }
}

