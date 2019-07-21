
import java.util.Arrays;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String s1s2 = s1 + s2;
        char[] array1 = s1s2.toCharArray();
        Arrays.sort(array1);
        String output = String.valueOf(array1[0]);
        char prevCharacter = array1[0];
        for (char letter : array1){
            if(letter != prevCharacter){
                output += letter;
            }
            prevCharacter = letter;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }
    }