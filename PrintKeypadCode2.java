public class PrintKeypadCode2 {
    public static void printkeypad(int input){
        printKeypad(input,"");
    }
    public static void printKeypad(int input,String output){
        if(input == 0){
            System.out.println(output);
            return;
        }
        String[] data = helper(input%10);
        for(int i=0;i< data.length; i++){
            printKeypad(input/10,data[i]+output);
        }
    }
    public static String[] helper(int x){
        String[] value = {""};
        switch (x){
            case 2:
                value = new String[]{"a", "b", "c"};
                break;
            case 3:
                value = new String[]{"d","e","f"};
                break;
            case 4:
                value = new String[]{"g","h","i"};
                break;
            case 5:
                value = new String[]{"j","k","l"};
                break;
            case 6:
                value = new String[]{"m","n","o"};
                break;
            case 7:
                value = new String[]{"p","q","r","s"};
                break;
            case 8:
                value = new String[]{"t","u","v"};
                break;
            case 9:
                value = new String[]{"w","x","y","z"};
                break;
            default:
                break;
        }
        return value;
    }
    public static void main(String[] args){
        int num = 234;
        printkeypad(num);
    }
}
