public class Main1{
    public static void main(String []args) {

        PangramDetector pd = new PangramDetector();
        Boolean success = true;
        success = success && "".equalsIgnoreCase(pd.findMissingLetters("the uick brown fox jumps over the lazy dog"));


        if(success) {
            System.out.println("All test passed");
        }
        else {
            System.out.println("There is a test failure");
        }
    }
} class PangramDetector {

    public static String findMissingLetters(String input) {
        String missingLetters = "";

        
        char[] ap = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char find ;

        for (int i = 0; i < 26; i++) {
            find =  ap[i];

        if ((input.indexOf(find) == -1)) {

            missingLetters += find;

            }

        }
System.out.println(missingLetters);
        return missingLetters;

    }
}

