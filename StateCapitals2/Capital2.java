package StateCapitals2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Capital2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> stateCapital = new HashMap<>();

        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("StateCapitals.txt")));

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            String[] keyValuePair = str.split("::", 2);
            stateCapital.put(keyValuePair[0], keyValuePair[1]);
        }

        System.out.println("50 STATES & CAPITALS ARE LOADED.\n" + "=======");

        //  Printing keys
        System.out.println("HERE ARE THE STATES :");
        Set<String> keys = stateCapital.keySet();
        for (String k : keys) {
            System.out.print(k + ", ");
        }
        System.out.println();


        // Guess
        // generate random index
        Random rm = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomIndex = rm.nextInt(keys.size());
        // change set into list
        List<String> list = new ArrayList<>(keys);
        // Obtain random state
        String randomState = list.get(randomIndex);
        // Get related capital
        String relateCapital = stateCapital.get(randomState);

        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + randomState + "'?");
        String userInput = scanner.nextLine();

        if (userInput.equals(relateCapital)) {
            System.out.println("NICE WORK! " + userInput +" IS CORRECT!");
        } else {
            System.out.println("WRONG! The correct answer is: " + relateCapital);
        }



    }


}
