package ArrayandArrayList;

import java.util.ArrayList;

public class Add {
    public static void main(String[] args) throws Exception {
//        Create a list of the words: "Sam", "I", "Am".
//        After each word, insert the word "Ham" into the list.
//        Display the result on the screen, each list element on a new line.
//
//                Requirements:
//	The program must not read data from the keyboard.
//	Declare a string list variable and immediately initialize it.
//	Add the following words to the list: "Sam", "I", "Am".
//	After each word, add the string "Ham" to the list.
//	Display the list items on the screen, each on a new line.
        String m1 = "Sam";
        String m2 = "I";
        String m3 = "Am";
        String m4 = "Ham";

        ArrayList<String> list = new ArrayList<>();
        list.add(m1); //0
        list.add(m2); //1
        list.add(m3); //2

        list.add(1, m4);
        list.add(3, m4);
        list.add(5, m4);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
