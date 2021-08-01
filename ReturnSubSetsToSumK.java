public class ReturnSubSetsToSumK {

    public static int[][] subsetsSumK(int []input, int k){
        int[][] ans = helper(input,k,0);
        return ans;
    }
    public static int[][]helper(int [] input, int k , int startindex){
        if(startindex==input.length){
            if(k==0){
                int[][] ans= new int[1][0];
                return ans;
            }
            else {
                int[][] ans = new int[0][0];
                return ans;
            }
        }
        int [][] included= helper(input,k-input[startindex],startindex+1);
        int [][] notincluded = helper(input,k,startindex+1);

        int [][] output = new int[included.length + notincluded.length][];

        int x=0;
        for (int i=0;i<included.length;i++){

            output[x]=new int[included[i].length+1];
            output[x][0]=input[startindex];

            for(int j=0;j<included[i].length;j++){
                output[x][j+1]=included[i][j];
            }
            x++;
        }
        for(int i=0;i<notincluded.length;i++){

            output[x]=new int [notincluded[i].length];

            for(int j=0;j<notincluded[i].length;j++){
                output[x][j]=notincluded[i][j];
            }
            x++;
        }
        return output;
    }

    public static void main(String[] args){
        int [] input = {2,1,3,2};
        int [][] output = subsetsSumK(input,4);
        for (int i=0;i<output.length;i++){
            for(int j=0;j<output[i].length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
