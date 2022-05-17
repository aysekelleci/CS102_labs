package cardgame;

import java.util.ArrayList;
import java.util.Arrays;

// Cardgame
// author: Tuna Okçu 22002940   
// date: 22/02/2021

public class CardGame {
    // properties

    final int NUMBER_OF_PLAYERS = 4;
    final int MAX_TURN = Cards.NOOFCARDSINFULLPACK / NUMBER_OF_PLAYERS;
    

    Cards fullPack;
    ArrayList<Player> players;
    ScoreCard scoreCard;
    Cards[] cardsOnTable;
    int roundNo;
    int turnOfPlayer;

    // constructors
    public CardGame(Player p1, Player p2, Player p3, Player p4) {
        players = new ArrayList<Player>(Arrays.asList(p1, p2, p3, p4));

        scoreCard = new ScoreCard(4);

        // At the end there are going to be as many cards on the table as
        cardsOnTable = new Cards[NUMBER_OF_PLAYERS];
        fullPack = new Cards(true);

        // At the beginning it's going to be the first round and the turn of the first
        // player
        roundNo = 1;
        turnOfPlayer = 1;

        /* Shuffle the deck and give the players their cards */

        fullPack.shuffle();
        for ( int i = 0; i < Cards.NOOFCARDSINFULLPACK; i++)
        {
            /* 0%4 = 0 --> the player corresponding to index 0 
            1%4 .... and so on */
            ( players.get( i % NUMBER_OF_PLAYERS ) ).add( fullPack.getTopCard() );

        }
    }

    // methods

    /**
     * Player p is going to play the card on top of his or her deck. Then it will be
     * the turn of the next player to play, and roundNo will also be updated if
     * necessary(i.e.) if the 4th player is the one who just played his or her turn.
     * 
     * @param p
     * @return
     */
    public boolean playTurn(Player p) {
        // The player can play IF its his or her turn and the game is not over. i.e.
        // The player can't play if either it's not his turn or the game is over.
        if ((isTurnOf(p) == false) || (isGameOver() == true)) {
            return false;
        }

        Card c = p.playCard();

        // playerNo - 1 = player's index

        scoreCard.update(turnOfPlayer - 1, c.getFaceValue());

        // Updating whose turn it is is straightforward unless its the last player's
        // turn.
        if (getTurnOfPlayerNo() != 4) {
            turnOfPlayer++;
            return true;
        }

        // If it IS the last player's turn then it circles back to the first player's
        // turn and another round begins.
        turnOfPlayer = 1;
        roundNo++;
        return true;
    }

    /**
     * Whether it is player p's turn or not is to be checked.
     * 
     * @param p
     * @return
     */
    public boolean isTurnOf(Player p) {
        /*
         * playerNo ranges from 1 to 4 and the index of players ranges from 0 to 3. The
         * playerNo of any given player is the index in the ArrayList players at which
         * the player object appears + 1. If this number is equal to turnOfPlayer then
         * it is the player's turn.
         */
        int playerNo = players.indexOf(p) + 1;
        return (playerNo == turnOfPlayer);
    }

    /**
     * Checks if the game is over i.e. whether 13 turns have been played yet.
     * 
     * @return
     */
    public boolean isGameOver() {
        // The game will go on as long as roundNo <= MAX_TURN
        return roundNo > MAX_TURN;
    }

    /**
     * Returns the score of the player whose number is given.
     * 
     * @param playerNumber
     * @return
     */
    public int getScore(int playerNumber) {
        return scoreCard.getScore(playerNumber);

    }

    /**
     * Use the number of a player to get the name of the player with the given
     * number.
     * 
     * @param playerNumber
     * @return
     */
    public String getName(int playerNumber) {
        // index = playerNumber - 1
        // Get the reference for the player object from the ArrayList and use the
        // getName() method on it.
        return (players.get(playerNumber - 1)).getName();
    }

    /**
     * Returns roundNo.
     * 
     * @return roundNo
     */
    public int getRoundNo() {
        return roundNo;
    }

    /**
     * Returns the no of the player whose turn it is to play.
     * 
     * @return turnOfPlayer
     */
    public int getTurnOfPlayerNo() {
        return turnOfPlayer;
    }

    /**
     * Returns the player(s) with the highest score
     * 
     * @return
     */
    public Player[] getWinners() {

        // Get the indices of the winners
        int[] winnersIndex = scoreCard.getWinners();
        Player[] winners = new Player[winnersIndex.length];
        for (int i = 0; i < winnersIndex.length; i++) {
            winners[i] = players.get(winnersIndex[i]);
        }

        return winners;
    }

    /**
     * Returns a string representation of the score card.
     * 
     * @return
     */
    public String showScoreCard() {
        return scoreCard.toString();
    }

}