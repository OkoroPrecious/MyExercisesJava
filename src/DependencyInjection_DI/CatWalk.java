package DependencyInjection_DI;

public class CatWalk implements  Walk{

    public CatWalk(){

    }
    @Override
    public void walk() {
        System.out.println("Cat walking currently");
    }
}
