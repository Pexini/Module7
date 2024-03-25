package Hard.Gallows;

import java.util.Locale;

public class HangmanGame {
    private String secretWord;
    public StringBuilder guessedWord;
    private int maxErrors;
    private int errors;
    private Player player1;
    private Player player2;

    public HangmanGame(String word, Player player1, Player player2) {
        this.secretWord = word.toLowerCase();
        this.guessedWord = new StringBuilder("*".repeat(word.length()));
        this.maxErrors = 6;
        this.errors = 0;
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean guessLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                guessedWord.setCharAt(i, letter);
                found = true;
            }
        }
        if (!found) {
            errors++;
        }
        return found;
    }

    public boolean isGameOver() {
        return errors >= maxErrors || guessedWord.toString().equals(secretWord);
    }
    public String getGuessedWord() {
        return guessedWord.toString();
    }
    public String getSecretWord() {
        return guessedWord.toString();
    }

    public int getErrors() {
        return errors;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

}

