package appletAndGame;

import java.util.Scanner;

/**
 * @author ankhbayarazzaya
 */
public class Words {

    public static void main(String[] args) {
    	System.out.println("ARguu :");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] words = s.split(" ", -1);

        //for (int i = 0; i < words.length; i++)
          //  System.out.print(words[i] + " ");
        //System.out.println();
        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("#")) {
                int result = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        words[j] = "#";
                        result++;
                    }
                }
                System.out.println(words[i] + " - " + result);
            }
        }

    }

}

