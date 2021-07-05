import java.util.Arrays;
 class Main {

    public static int[] longestUniformSubstring(String input)
    {
        int length= input.length(); 
int longestUnifromIndex = 0 ,longestSubStringLength = 1,count = 1;
        char[] ch = input.toCharArray();
        for(int i =0;i<length;i++) {
            for(int j =i+1;j<length;j++){

                if(ch[i] == ch[j]) {
                    count = count + 1;

                }

                }
            if(longestSubStringLength < count){
               longestSubStringLength = count;
                count = 1;
                longestUnifromIndex = i;

            } else {

                count = 1;

            }

        }
        System.out.println( longestUnifromIndex+ " " + longestSubStringLength);
        return new int[]{longestUnifromIndex,longestSubStringLength};
    }


    public static void main(String[] args) {

        boolean pass=true;

            int[] result = longestUniformSubstring("100001111");
            int[] result1 = longestUniformSubstring("aabbbbCdAA");
	    int[] result2 = longestUniformSubstring("yaaamini");
            pass=pass && (Arrays.equals(result, new int[]{0,5}));
            pass=pass && (Arrays.equals(result1,new int[]{2,4}));
	    pass=pass && (Arrays.equals(result2,new int[]{1,3}));


        if(pass)
        {
            System.out.println("all tests pass");

        }
        else
        {
            System.out.println("there is a test failure");
        }
    }

}