import java.util.ArrayList;

public class PermutationofAString2 {
    private static ArrayList<String> helper(String str, String current)
    {
        if(str.length()==0)
        {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(current);
            return temp;
        }
        ArrayList<String> output = new ArrayList<>();
        for(int i =0;i<str.length();i++)
        {
            String newString = ""+str.substring(0,i)+str.substring(i+1);
            ArrayList<String> t1 = helper(newString,current+str.charAt(i));
            output.addAll(t1);

        }
        return output;

    }
    public static String[] permutationOfString(String input){
        // Write your code here
        ArrayList<String> list = helper(input,"");
        int i =0;
        String str[] = new String[list.size()];
        for(String j:list)
            str[i++]=j;
        return str;
    }
    public static void main(String[] args){
       String input = "abc";
       String[] output = permutationOfString(input);
        for (String x: output ) {
            System.out.println(x);
        }
    }
}
