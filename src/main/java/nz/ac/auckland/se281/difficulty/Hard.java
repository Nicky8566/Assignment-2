package nz.ac.auckland.se281.difficulty;

import nz.ac.auckland.se281.strategy.RandomStrat;
import nz.ac.auckland.se281.strategy.TopStrat;

public class Hard extends LevelDifficulty {
  public int numberFingers() {

    if (rounds >= 4) {
      if (botsResult == "lost" && strategy.getStrategy() instanceof TopStrat) {
        strategy.setStrategy(new RandomStrat());
      }
      if (botsResult == "lost" && strategy.getStrategy() instanceof RandomStrat) {
        strategy.setStrategy(topStrat);
      }
    } 
    return strategy.process()
  }
}
