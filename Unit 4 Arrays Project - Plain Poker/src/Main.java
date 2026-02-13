//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileData = "";
        int[] numofTypes = new int[8];
        int totalBidValue = 0;
        int[] total_ranks = new int[79];

        String[] cards = null;
        int bid = 0;
        String line;
        try {
            File f = new File("src/data");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                line = s.nextLine();
                fileData += line + "\n";

                String[] parts = line.split("\\|");
                cards = parts[0].split(",");
                bid = Integer.parseInt(parts[1]);


                Hand handObj = new Hand(cards, bid);

                int handType = handObj.determineHand();
                numofTypes[handType]++;

                //PART 2
                for (total_ranks: handType) {
                    return;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        System.out.println();

        System.out.println("Number of five of a kind hands: " + numofTypes[7]);
        System.out.println("Number of four of a kind hands: " + numofTypes[6]);
        System.out.println("Number of full house hands: " + numofTypes[5]);
        System.out.println("Number of three of a kind hands: " + numofTypes[4]);
        System.out.println("Number of two pairs hands: " + numofTypes[3]);
        System.out.println("Number of one pair hands: " + numofTypes[2]);
        System.out.println("Number of high card hands: " + numofTypes[1]);
        System.out.println();

    }
}
