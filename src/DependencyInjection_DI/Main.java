package DependencyInjection_DI;

public class Main {
    public static void main(String[]args){
        Walk[] w = new Walk[2];
        w[0] = new CatWalk();
        w[1] = new DogWalk();
//        w[2] = new Human(new Human());
        Walkables.letThemWalk(w);
    }
}
