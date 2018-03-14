// Design a checker class which implements Comparator interface
// Sort them by score, if the score is same sort them by name

// Write your Checker class here
class Checker implements Comparator<Player>{
    public int compare(Player p1, Player p2){
        if(p1.score==p2.score)
            return p1.name.compareTo(p2.name);
        return p2.score-p1.score;
    }
}
