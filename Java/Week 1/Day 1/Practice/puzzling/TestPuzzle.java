import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        ArrayList<String> randomLetters = generator.getAllLetters();
        String randomPassword = generator.generatePassword();
        ArrayList<String> newPassword = generator.getNewPasswordSet(7);
        // System.out.println(randomRolls);
        // System.out.println(randomLetters);
        System.out.println(randomPassword);
        System.out.println(newPassword);
    }
}
