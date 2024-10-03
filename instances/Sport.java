package instances;

public class Sport {
    private String name;
    private String sportName;
    

    public Sport(String name, String sportName){
        this.name = name;
        this.sportName = sportName;
        
    }

    public String getName () {
        return name;
    }
    public String getSportName () {
        return sportName;
    }
    

    @Override
    public String toString() {
        return name + "s favorite sport is " + 
        sportName;
    }
}