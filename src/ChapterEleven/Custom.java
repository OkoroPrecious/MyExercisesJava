package ChapterEleven;

import java.util.Scanner;

public class Custom {
    private static final Scanner scanner = new Scanner(System.in);
    public static void collectInput() throws CustomException.CohortElevenException {
        System.out.println("Enter a positive number: ");
        int userInput = scanner.nextInt();

        if(userInput < 0){
            throw new CustomException.CohortElevenException("Can not take negative integer!!");
        }
    }

    public static void main(String[] args) {
        try{
            collectInput();
        } catch (CustomException.CohortElevenException cE){
            System.out.println(cE.getMessage());
        }
    }

    public static Scanner getScanner() {
        return scanner;
    }
}