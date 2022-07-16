package DependencyInjection_DI;


public class DogWalk implements  Walk{

    public DogWalk(){

    }
    @Override
    public void walk() {
        System.out.println("Dog walking at the moment");
    }
}
