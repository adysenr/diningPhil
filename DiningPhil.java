public class DiningPhil {
    public static void main(String[] args) {
        
        // initialize forks at table
        Fork[] forks = new Fork[5];
        for(int i = 0; i < 5; i++) {
            forks[i] = new Fork(i);
        }

        // initialize philosophers and the forks they are capable of using
        Phil[] phils = new Phil[5];
        phils[0] = new Phil("Aristotle", forks[0], forks[1]);
        phils[1] = new Phil("Plato", forks[1], forks[2]);
        phils[2] = new Phil("Socrates", forks[2], forks[3]);
        phils[3] = new Phil("Descartes", forks[3], forks[4]);
        phils[4] = new Phil("Rousseau", forks[4], forks[0]);

    }
}

class Phil extends Thread {

    private Fork = leftFork;
    private Fork = rightFork;
    private Strink name;

    public Phil(String name, Fork left, Fork right) {
        
    }

    public void think() {

    }

    public void eat() {

    }

    public void run() {

    }
}

class Fork {
    public String fork;
    public boolean inUse;

    public Fork(String fork) {
        this.fork = fork;
    }

    public synchronized void pickUp() {

    }

    public synchronized putDown() {

    }
}