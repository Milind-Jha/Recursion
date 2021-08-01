public class StringSubsequence {    //if String = "xyz" Subsequence = {"x","xz","xy","xyz","yz","","y","z"}

        public static String[] subsequences(String str){

            if(str == ""){
                 String[] ans ={""};
                 return ans;
            }
            String[] smallans = subsequences(str.substring(1));
            String[] sol = new String[smallans.length*2];
            for (int i=0;i<smallans.length;i++){
                sol[i] = str.charAt(0)+smallans[i];
            }
            for(int j=smallans.length;j<sol.length;j++){
                sol[j] = smallans[j-smallans.length];
            }
            return sol;
        }
        public static void main(String[] args){
            String input = "ab";
            int count=0;
            String[] output = subsequences(input);
            for (String s:output ) {
                if(s==""){
                    System.out.println("Empty String");
                }
                else{
                    System.out.println(s);
                }
                count++;
            }
            System.out.println("Total no of substrings : "+ count);
        }
}
