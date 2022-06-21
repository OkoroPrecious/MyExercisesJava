package String;

public class String_charAt {
    public static void main(String[]args) {
        //Given a String  s, "abcdabcdabca". Return a count of the number of A's in s.
        // on charAt()

        String s = "abcdabcdabca";
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            // if(s.charAt(i) != ' ')
            //    count++;
            if(s.charAt(i) == 'a'){
                count++;
                System.out.println(s.charAt(i));
            }

        }

        System.out.println("\nTotal number of characters (a) in  String s: " + count);
    }
}
