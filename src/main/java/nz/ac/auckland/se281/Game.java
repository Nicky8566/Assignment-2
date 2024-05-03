package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Main.Choice;
import nz.ac.auckland.se281.Main.Difficulty;

/** This class represents the Game is the main entry point. */
public class Game {
  private int round = 0;
  private String playerName;
  private String numberFingers;

  public void newGame(Difficulty difficulty, Choice choice, String[] options) {
    // the first element of options[0]; is the name of the player
    MessageCli.WELCOME_PLAYER.printMessage(options[0]);
    playerName = options[0];
  }

  public void play() {
    round++;
    // print start round meesage
    MessageCli.START_ROUND.printMessage(String.valueOf(round));
    // print ask input meesage
    MessageCli.ASK_INPUT.printMessage();
    // go through a while loop until the input is correct
    while (true) {
      String input = Utils.scanner.nextLine();
      if (Utils.isInteger(input)) {
        int fingers = Integer.parseInt(input);
        if (fingers >= 0 && fingers <= 5) {
          numberFingers = input;
          break;
        }
      }
      // print error meesage
      MessageCli.INVALID_INPUT.printMessage();
    }
    // print info hand meesage
    MessageCli.PRINT_INFO_HAND.printMessage(
        String.format("Player %s: fingers: %s", playerName, numberFingers));
  }

  public void endGame() {}

  public void showStats() {}
}