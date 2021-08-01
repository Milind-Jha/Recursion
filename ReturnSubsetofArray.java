public class ReturnSubsetofArray {
    public static int[][] subsets(int input[]) {
        return helper(input, 0);
    }

    private static int[][] helper(int[] input, int startindex) {
        if (startindex == input.length) {
            return new int[1][0];
        }

        int[][] smalloutput = helper(input, startindex + 1);

        int[][] output = new int[2 * smalloutput.length][];

        int x = 0;


        for (int i = 0; i < smalloutput.length; i++) {
            output[x] = new int[smalloutput[i].length];
            for (int j = 0; j < smalloutput[i].length; j++) {

                output[x][j] = smalloutput[i][j];
            }
            x++;
        }
        for (int i = 0; i < smalloutput.length; i++) {

            output[x] = new int[smalloutput[i].length + 1];
            output[x][0] = input[startindex];

            for (int j = 1; j <= smalloutput[i].length; j++) {
                output[x][j] = smalloutput[i][j - 1];
            }
            x++;
        }
        return output;
    }

        public static void main (String[]args){
            int[] input = {2, 1, 3, 2};
            int[][] output = subsets(input);
            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j < output[i].length; j++) {
                    System.out.print(output[i][j] + " ");
                }
                System.out.println();
            }
        }
}
