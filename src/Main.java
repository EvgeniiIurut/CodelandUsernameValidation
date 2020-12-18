import java.util.*;
import java.io.*;

class Main {

    public static String CodelandUsernameValidation(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if ((stringBuilder.length() <= 25) && (stringBuilder.length() > 3) &&
                (str.charAt(0) <= 'z') && (str.charAt(0) >= 'a') &&
                (stringBuilder.charAt(str.length() - 1) != '_')){
            for (char a : str.toCharArray()) {
                if (!((a < 'z' && a > 'a') || (a == '_') || (a < '9' && a > '0'))) {
                    return "false";
                }
            }
        } else return "false";
        return "true";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}