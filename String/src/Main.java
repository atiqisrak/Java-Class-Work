import java.awt.*;
public class Main {
    public static void main(String[] args){
        String userInput = "Niloy niil";
        //Declaring and saving data or it will be lost
        String upperCase = userInput.toUpperCase();
        String lowerCase = upperCase.toLowerCase();
        //printing the main string
        System.out.println(userInput);
        //printing in uppercase
        System.out.println(upperCase);
        //printing in lowercase
        System.out.println(lowerCase);
        //Printing First Character of the string
        char character = userInput.charAt(6);
        System.out.println(character);
        //Searching Text
        System.out.println("Contains: " + userInput.contains("Nil"));
        System.out.println("Contains: " + userInput.contains("Niil"));
        System.out.println("Contains: " + userInput.contains("Niil".toLowerCase()));
    }
}