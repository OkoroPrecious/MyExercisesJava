package DependencyInjection_DI;

public class Walkables {
    public static void letThemWalk(Walk[] list) {
        for (Walk w : list) {
            w.walk();
        }
    }

}
