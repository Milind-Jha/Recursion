public class PrintSubsequence2 {
    public static void printSubsequence(String input){
        helper(input,"");

    }

    private static void helper(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        helper(input.substring(1),output);
        helper(input.substring(1),output+input.charAt(0));
    }
    public static void main(String[] args){
        printSubsequence("xyz");
    }
}
