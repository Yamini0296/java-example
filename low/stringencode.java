public class Main {


    public static String rle(String input)

    {    //input length
	 int n = input.length();
		// to store count
		int count;
	//output stored in result
        String result = "";
	//input string converted into char and stored in ch array
        char[] ch = input.toCharArray();
	// example lenth=5
        for(int i =0;i<n;i++) {
            count = 1;
            while (i < n - 1 && ch[i] == ch[i + 1]) {

                count = count + 1;
                i++;

            }
            result = result + ch[i] + count;

        }
        return result;
    }
    public static void doTestPass()
    {
        Assert.assertEquals("",rle(""));
        Assert.assertEquals("a1",rle("a"));
        Assert.assertEquals("a3",rle("aaa"));
        Assert.assertEquals("a3b3a2d1",rle("aaabbbaad"));
    }
    public static void main() throws InterruptedException
    {
        JUnitCore.main("Solution");
    }
}