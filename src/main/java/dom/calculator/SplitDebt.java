package dom.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SplitDebt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> share = new ArrayList<>();
        Map<String, Integer> listOfDebt = new HashMap<>();

        int button;
        int i = 1;

        System.out.println("Add purchase amount: ");
        int purchaseAmount = scanner.nextInt();

        do {
            System.out.println("Enter " + i + "th member's name:");
            String membersName = scanner.next();

            System.out.println("Do you want to add else? Press 1 to continue and 2 stop.");
            button = scanner.nextInt();

            names.add(membersName);
            i++;
        }   while (button == 1);

        System.out.println("Select buyer's name: " );
        String bName = scanner.next();

        int amountOfMembers = i - 1;

        int dividedBye = purchaseAmount/amountOfMembers;

        for (int i1 = 0; i1 < names.size(); i1++) {
            share.add(dividedBye);
        }

        for (int j = 0; j < names.size(); j++) {
            listOfDebt.put(names.get(j),share.get(j));
        }

        boolean buyer = listOfDebt.containsKey(bName);

        if (buyer){
            listOfDebt.remove(bName);
        }

        System.out.println(listOfDebt);










    }
}
