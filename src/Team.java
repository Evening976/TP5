import java.util.Random;

public class Team {
    private static final Random generator = new Random();
    private final String name;
    private final long ID;

    public Team(String name){
        this.name = name;
        ID = generator.nextLong();
    }

    public String getName(){
        return name;
    }

    public long getID(){
        return ID;
    }

    public String toString(){
        return "Team name: " + name + " ID: " + ID;
    }

}
