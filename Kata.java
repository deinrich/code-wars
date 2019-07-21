public class Kata
{
    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length-1; i++){
            if(array[i+1] != array[i]+1){
                char a = array[i];
                a++;
                return a;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        char[] array = {'O','Q','R','S'};
        System.out.println(findMissingLetter(array));
    }
}
