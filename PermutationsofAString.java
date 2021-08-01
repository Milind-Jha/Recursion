public class PermutationsofAString {
    public static String[] permutationOfString(String input){

        if(input.length()==0){
            String arr[]=new String[1];
            arr[0]="";
            return arr;
        }

        String smallOutput[] =  permutationOfString(input.substring(1));
        String output[] = new String[input.length()*smallOutput.length];
        int k=0;

        for(int i=0;i<smallOutput.length;i++){

            String currentStr = smallOutput[i];

            for(int j=0;j<=currentStr.length();j++){
                output[k] = currentStr.substring(0,j)+input.charAt(0)+currentStr.substring(j);
                k++;
            }
        }
        return output;
    }
    public static void main(String[] args){
        String input ="abc";
        String [] output = permutationOfString(input);
        for(String x:output){
            System.out.println(x);
        }
    }
}
