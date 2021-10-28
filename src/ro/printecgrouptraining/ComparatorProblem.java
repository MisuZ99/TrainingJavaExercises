package ro.printecgrouptraining;

import java.util.Comparator;

public class ComparatorProblem {
    class Checker implements Comparator<Player> {
        // complete this method
        public int compare(Player a, Player b) {
            if(a.score!=b.score) {
                return b.score-a.score;
            }
            else return a.name.compareTo(b.name);
        }
    }

    public class Player {

         int score;
         String name;


    }
}
