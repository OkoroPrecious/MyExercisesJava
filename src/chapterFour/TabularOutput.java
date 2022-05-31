package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("N\t\tN2\t\tN3\t\tN4%n");
        for(int i = 1; i<= 5; i++){
            System.out.printf("%d \t\t%d \t\t%d\t\t%d%n", i, i*i, i*i*i, i*i*i*i);
        }
    }
}
