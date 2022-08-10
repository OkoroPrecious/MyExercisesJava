package DependencyInjection_DI;

public class Human implements Walk {

    private Walk walkInPidgin;

    //constructor
    public Human(Walk walkInPidgin){
        this.walkInPidgin = walkInPidgin;
    }
    //setter method
    public void setWalkInPidgin(Walk walkInPidgin){
        this.walkInPidgin = walkInPidgin;
    }

    public void walk(){
        walkInPidgin.walk();
    }

}
