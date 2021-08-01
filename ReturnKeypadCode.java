public class ReturnKeypadCode {
    public static String[] keypad(int n){
        if(n==0){
            String[] output={""};
            return output;
        }
        int digit = n%10;
        int x = n/10;
        String[] smallans = keypad(x);
        String[] temp = helper(digit);
        String[] ans  = new String[smallans.length*temp.length];
        int index=0;
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<smallans.length;j++){
                ans[index++]=smallans[j]+temp[i];
            }
        }
        return ans;
    }
    private static String[] helper(int num){
        String[] ans={""};
        switch (num){
            case 2:
                 ans = new String[]{"a", "b", "c"};
                 break;
            case 3:
                ans = new String[]{"d","e","f"};
                break;
            case 4:
                ans = new String[]{"g","h","i"};
                break;
            case 5:
                ans = new String[]{"j","k","l"};
                break;
            case 6:
                ans = new String[]{"m","n","o"};
                break;
            case 7:
                ans = new String[]{"p","q","r","s"};
                break;
            case 8:
                ans = new String[]{"t","u","v"};
                break;
            case 9:
                ans = new String[]{"w","x","y","z"};
                break;
            default:
                break;
        }
        return ans;
    }
    public static void main(String[] args){
        int num = 234;
        String[] solution = keypad(num);
        for (String s:solution ) {
            System.out.println(s);
        }
    }
}
