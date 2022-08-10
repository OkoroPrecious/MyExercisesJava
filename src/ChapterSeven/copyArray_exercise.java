package ChapterSeven;

public class copyArray_exercise {
    //Use the arraycopy method to copy the following array to a target array t:
    //int[] source = {3, 4, 5};
    public static void main(String[]args){
        int[] sourceArray = {3, 4, 5};
        int[] tArray = new int[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            tArray[i] = sourceArray[i];
            System.out.print(tArray[i] + " ");
        }

    }
}
