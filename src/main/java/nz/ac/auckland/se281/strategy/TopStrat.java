package nz.ac.auckland.se281.strategy;

import static nz.ac.auckland.se281.Utils.isEven;
import static nz.ac.auckland.se281.Utils.isOdd;

import nz.ac.auckland.se281.Main.Choice;
import nz.ac.auckland.se281.Utils;

public class TopStrat extends Strategy {
  /*
   * This method returns a number between 1 and 5 depending 
   * if the players has primarliy chosen odd or even for their fingers.
   *
   * @return a number between 1 and 5.
   */
  @Override
  public int execute() {

    // check if the players history has more odd or even numbers in it
    for (int i = 0; i < history.size(); i++) {
      if (isEven(history.get(i))) {
        even++;
      }
      if (isOdd(history.get(i))) {
        odd++;
      }
    }

    if (oddOrEven == Choice.EVEN && even > odd || oddOrEven == Choice.ODD && odd > even) {
      resetEvenOdd();
      // if there are more even numbers return odd
      return Utils.getRandomOddNumber();
    }

    if (oddOrEven == Choice.EVEN && odd > even || oddOrEven == Choice.ODD && even > odd) {
      resetEvenOdd();
      // if there are more even numbers return even
      return Utils.getRandomEvenNumber();
    }
    if (odd == even) {
      resetEvenOdd();
      return Utils.getRandomNumberRange(0, 5);
    }
    // TO TELL ME IT WAS AN ERROR
    return 35505;
  }
}
