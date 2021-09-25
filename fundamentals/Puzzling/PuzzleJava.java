import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    Random randomGenerator = new Random();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public ArrayList<Integer> generateTenRolls(int randomBound){
        ArrayList<Integer> tenRandomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            tenRandomNumbers.add(randomGenerator.nextInt(randomBound) + 1);
        }
        return tenRandomNumbers;
    }
    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = randomGenerator.nextInt(26);
        return alphabet[randomIndex];
    }
    public String generatePassword(){
        String passwordString = new String();
        for (int i = 0; i < 8; i++) {
            passwordString += getRandomLetter();
        }
        return passwordString;

    }
    public ArrayList<String> getNewPasswordSet(int arrayLength){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < arrayLength; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
    public ArrayList<String> shuffleArray(ArrayList<String> stringArray){
        System.out.println("Original Array:");
        System.out.println(stringArray);
        for (int i = 0; i < stringArray.size(); i++) {
            int randomIndex = randomGenerator.nextInt((stringArray.size() - 1));
            String temp = stringArray.get(i);
            stringArray.set(i, stringArray.get(randomIndex));
            stringArray.set(randomIndex,temp);
        }
        System.out.println("Mutated Array");
        return stringArray;
    }
}