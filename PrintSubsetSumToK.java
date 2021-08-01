public class PrintSubsetSumToK {
    public static void printSubsetsSumTok(int input[], int k) {
        int[] output = {};
        helper(input,k,0,output);

    }

    private static void helper(int[] input, int k, int startindex, int[] output) {
        if(input.length==startindex){
            if(k==0){
                for (int x: output) {
                    System.out.print(x+" ");
                }
                System.out.println();
                return;
            }
            else {
                return;
            }
        }
        int[] output2 = new int[output.length+1];
        for (int i=0;i< output.length;i++){
            output2[i]=output[i];
        }
        output2[output.length]=input[startindex];
        helper(input,k,startindex+1,output);
        helper(input,k-input[startindex],startindex+1,output2);

    }
    public static void main(String[] args){
        int[] input ={5,12,3,17,1,18,15,3,17 };
        printSubsetsSumTok(input,6);
    }
}
