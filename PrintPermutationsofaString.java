public class PrintPermutationsofaString {
    public static void permutations(String input){
        String output = "";
        helper(input,output);
    }

    private static void helper(String input, String output) {

        if(input.length()==0){
            for(int i=0;i<output.length();i++){
                System.out.print(output.charAt(i));
            }
            System.out.println();
            return;
        }

        for(int i=0;i<input.length();i++) {
            helper(  input.substring(0 , i) + input.substring(i+1) , output + input.charAt(i));
        }
    }
    public static void main(String[] args){
        String input = "agi";
        permutations(input);
    }
}
