public class PrintSubsets {
    public static void printSubsets(int [] input){
        int[] output={};
        helper(input,output);
    }
    private static void helper(int[] input, int[] output){
        if(input.length==0){
            for (int i= output.length-1;i>=0;i--) {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        int temp = input[0];
        int []input2=new int[input.length-1];
        for(int i=1;i< input.length;i++){
            input2[i-1]=input[i];
        }
        int[] output2=new int[output.length+1];
        output2[0]=temp;
        for(int i=0;i< output.length;i++){
            output2[i+1]=output[i];
        }
        helper(input2,output);
        helper(input2,output2);
    }
    public static void main(String[] args){
        int[] input ={15,20,12};
        printSubsets(input);
    }
}
