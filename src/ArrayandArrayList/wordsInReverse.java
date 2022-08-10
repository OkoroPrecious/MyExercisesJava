package ArrayandArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class wordsInReverse {
    public static void main(String[]args)throws Exception {

//  Read 5 words from the keyboard and add them to a list of strings.
//  Remove the 3rd item in the list, and then display the remaining items in reverse order.
//  Requirements:
//	Declare a ArrayList<String> variable and immediately initialize it.
//	Read 5 lines from the keyboard and add them to the list.
//	Remove the third element of list.
//	Display the items on the screen, each on a new line.
//	The display order must be reversed.
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bis.readLine();
            list.add(s);
        }

        list.remove(2);
        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
        }



    }

}
