package blackJack;

import java.util.Scanner;

public class BlackJack {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");

        double playerMoney = 100.00;
        // Game loop
        while (playerMoney > 0) {
            // talia stół
            Deck playingDeck = new Deck();

            // talia dla graczy
            PlayerDeck playerDeck = new PlayerDeck();
            PlayerDeck dealerDeck = new PlayerDeck();

            System.out.println("------------START GAME-----------");
            System.out.println("You have $ " + playerMoney + ", how much would you like to bet?");
            double playerBet = userInput.nextDouble();
            if (playerBet > playerMoney) {
                System.out.println("You cannot bet more than you have. Please leave.");
                break;
            }

            // Starts Dealing
            // Playing get to cards
            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            // dealer 2 cards
            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while (true) {
                System.out.println("Your hand: ");
                System.out.println(playerDeck.toString());
                System.out.println("Your hand is value at: " + playerDeck.cardsValue());

                System.out.println("Dealer hand: " + dealerDeck.getCard(0) + " and [Hidden]");

                System.out.println("Would you like to (1) HIT or (2) Stand?");
                int response = userInput.nextInt();

                if (response == 1) {
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw a: " + playerDeck.getLastCard());
                    if (playerDeck.cardsValue() >= 21) {
                        break;
                    }
                }
                if (response == 2) {
                    break;
                }
            }

            // bust if >21
            if (playerDeck.cardsValue() > 21) {
                System.out.println("Bust. Currently valued at: " + playerDeck.cardsValue()); // mozna dodac .toString() ale nie trzeba bo wywoła to automatycznie
                playerMoney -= playerBet;
                continue;
            }

            // diler ujawnia karty
            System.out.println("Dealer Cards: " + dealerDeck.toString());

            // if dealer has more points than player, THEN WIN
            if (dealerDeck.cardsValue() > playerDeck.cardsValue()) {
                System.out.println("Dealer beats you!!!");
                playerMoney -= playerBet;
                continue;
            }
            // dealer draws at 16, stand at 17
            while (dealerDeck.cardsValue() < 17) {
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer Draws: " + dealerDeck.getLastCard());
            }

            // display total value for dealer
            System.out.println("Dealer Hand is value at: " + dealerDeck.cardsValue());
            // determine if dealer busted
            if (dealerDeck.cardsValue() > 21) {
                playerMoney += playerBet;
                continue;
            }

            // determine of push
            if (playerDeck.cardsValue() == dealerDeck.cardsValue()) {
                System.out.println("Push!");
                continue;
            }

            if (playerDeck.cardsValue() > dealerDeck.cardsValue()) {
                System.out.println("You win the hand!");
                playerMoney += playerBet;
                continue;
            }

            System.out.println("End of hand.");
        }
        System.out.println("Game over! Your are out of money. : ");
    }
}
