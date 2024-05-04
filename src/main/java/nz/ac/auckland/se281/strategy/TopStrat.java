package nz.ac.auckland.se281.strategy;

import java.util.ArrayList;
import java.util.List;

public class TopStrat implements Strategy {
  // create array list
  private static List<Integer> history = new ArrayList<>();

  public int execute() {
    return 10;
  }

  public void addPlayerNum(int num) {
    history.add(num);
  }

  public void resetHistory() {
    history.clear();
  }
}
