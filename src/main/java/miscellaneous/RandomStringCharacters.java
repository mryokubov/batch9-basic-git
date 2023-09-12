package miscellaneous;

import java.util.Random;

public class RandomStringCharacters {
    /**
     * This method will generate random selection of String text. It will take below arguments.
     * @param text
     * @param lengthOfString
     * @return
     */
    public static String generateRandomString( String text, int lengthOfString ){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lengthOfString; i++) {
           char randomChars = text.charAt(random.nextInt(text.length()));
            sb.append(randomChars);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "AbcDEfGh!IJkLmnOPqRs$TwV#xYZ1234%56789&";
        int lengthOfString = 16;
        String randomString = generateRandomString(text, lengthOfString);
        System.out.println(randomString);


    }
}
