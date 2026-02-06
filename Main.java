//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileData = "";
        int[] cardAmount = new int[13];
        int numFive = 0;
        int numFour = 0;
        int numFullHouse = 0;
        int numThree = 0;
        int numTwo = 0;
        int numOne = 0;
        int numHigh = 0;

        try {
            File f = new File("src/data");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                fileData += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        System.out.println(fileData);
        String[] lines = fileData.split("\n");


        for (int i = 0; i < lines.length; i++) {
            cardAmount = new int[13];

            String line = lines[i];
            String onlyPart1 = line.split("\\|")[0];
            String[] hand = onlyPart1.split(",");

            System.out.println(Arrays.toString(hand));


            for (String oneCard : hand) {
                if (oneCard.equals("Ace")) {
                    cardAmount[0]++;
                }
                if (oneCard.equals("2")) {
                    cardAmount[1]++;
                }
                if (oneCard.equals("3")) {
                    cardAmount[2]++;
                }
                if (oneCard.equals("4")) {
                    cardAmount[3]++;
                }
                if (oneCard.equals("5")) {
                    cardAmount[4]++;
                }
                if (oneCard.equals("6")) {
                    cardAmount[5]++;
                }
                if (oneCard.equals("7")) {
                    cardAmount[6]++;
                }
                if (oneCard.equals("8")) {
                    cardAmount[7]++;
                }
                if (oneCard.equals("9")) {
                    cardAmount[8]++;
                }
                if (oneCard.equals("10")) {
                    cardAmount[9]++;
                }
                if (oneCard.equals("Jack")) {
                    cardAmount[10]++;
                }
                if (oneCard.equals("Queen")) {
                    cardAmount[11]++;
                }
                if (oneCard.equals("King")) {
                    cardAmount[12]++;
                }
            }

            int pairs = 0;
            for (int amount : cardAmount) {
                if (amount == 2) {
                    pairs++;
                }
            }
            if (pairs > 1) {
                numTwo++;
            } else if (pairs == 1) {
                numOne++;
            }

            int singles = 0;
            //add here loop? to check for each of the kind
            for (int amount : cardAmount) {
                if (amount == 5) {
                    numFive++;
                } else if (amount == 4) {
                    numFour++;
                } else if (amount == 3) {
                    if (pairs == 1) {
                        numFullHouse++;
                        numOne--;
                    } else {
                        numThree++;
                    }
                } else if (amount == 1) {
                    singles++;
                }
            }
            if (singles == 5) {
                numHigh++;
            }
        }
        System.out.println();

        System.out.println("Number of five of a kind hands: " + numFive);
        System.out.println("Number of full house hands: " + numFullHouse);
        System.out.println("Number of four of a kind hands: " + numFour);
        System.out.println("Number of three of a kind hands: " + numThree);
        System.out.println("Number of two pairs hands: " + numTwo);
        System.out.println("Number of one pair hands: " + numOne);
        System.out.println("Number of high card hands: " + numHigh);

    }
}

