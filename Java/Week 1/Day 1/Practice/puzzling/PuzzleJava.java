import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            randomList.add(randMachine.nextInt(21));
        }
        return randomList;
    }

    public ArrayList<String> getAllLetters() {
        String alpha[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        Random randMachine = new Random();
        ArrayList<String> randomList = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            randomList.add(alpha[randMachine.nextInt(alpha.length)]);
        }
        return randomList;
    }

    public String generatePassword() {
        String alpha = "abcdefghijklmnopqrstuvxwyz";
        Random randMachine = new Random();
        String password = new String();
        for (int i = 0; i < 8; i++) {
            password = password + alpha.charAt(randMachine.nextInt(26));
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int passLength) {
        String alpha = "abcdefghijklmnopqrstuvxwyz";
        Random randMachine = new Random();
        String password = new String();
        ArrayList<String> passwordArr = new ArrayList<String>();
        for (int j = 0; j < passLength; j++) {
            password = "";
            for (int i = 0; i < 8; i++) {
                password = password + alpha.charAt(randMachine.nextInt(8));
            }
            passwordArr.add(password);
        }
        return passwordArr;
    }
}
