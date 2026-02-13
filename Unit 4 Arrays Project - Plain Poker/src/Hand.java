public class Hand {
    private String[] cards;
    private int bid;
    private int strength;
    private int rank;


    public Hand(String[] cards, int bid) {
        this.cards = cards;
        this.bid = bid;
        this.strength = 0;
        this.rank = 0;
    }

    public int comparedTo (Hand other) {
        int currentType = determineHand();
        int otherType = other.determineHand();

        if (currentType > otherType) {
            return 1;
        }
        if (currentType < otherType) {
            return -1;
        }

        for (int i = 0; i < 5; i++) {
            int thisValue =
        }
    }

    public int[] getcardAmount {
        return c
    }
    public int determineHand() {
        int[] cardAmount = new int[13];
        for (String oneCard : cards) {

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
        int single = 0; //high card
        int pairs = 0;
        int numofThree = 0;
        int numofFour = 0;
        int numofFive = 0;

        for (int amount: cardAmount) {
            if (amount == 1) {
                single++;
            } else if (amount == 2) {
                pairs++;
            } else if (amount == 3) {
                numofThree++;
            } else if (amount == 4) {
                numofFour++;
            } else if (amount == 5) {
                numofFive++;
            }
        }
        //return statemenets
        if (numofFive == 1) {
            return 7;
        } else if (numofFour == 1) {
            return 6;
        } else if (numofThree == 1 && pairs == 1) {
            return 5;
        } else if (numofThree == 1){
            return 4;
        } else if (pairs == 2) {
            return 3;
        } else if (pairs == 1) {
            return 2;
        } else if (single == 5) {
            return 1;
        }

        return 0;
    }


}

