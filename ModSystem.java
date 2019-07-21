public class ModSystem {

    public static String fromNb2Str(int n, int[] sys) {
        int product = sys[0];
        for (int i = 1; i < sys.length; i++) {
            product *= sys[i];
        }
        if (product < n){
            return "Not applicable";
        }

        int a = 1;

        for (int i = 0; a < sys.length; i++) {
            for (int j = a; j < sys.length ; j++) {
                if(greatestCommonDivider(sys[i],sys[j]) != 1 ){
                    return "Not applicable";
                }
            }
            a++;
        }

        StringBuilder sb = new StringBuilder(sys.length);
        for (int number : sys) {
            sb.append("--" + n%number);
        }
        sb.replace(0,2,"-");
        sb.append("-");
        return sb.toString();
    }

    private static  int greatestCommonDivider(int a, int b){
        int temp;
        while(b != 0){
            temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] lst = new int[] {2, 3, 4};
        System.out.println(fromNb2Str(6, lst));
    }
}