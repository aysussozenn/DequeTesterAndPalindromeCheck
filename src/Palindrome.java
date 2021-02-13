
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) throws IOException {

        MyStack<Character> myStack = new MyStack<Character>();
        System.out.println("Please enter the file name");
        //file name = palindromes.txt
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(text));
        String line;
        while ((line = reader.readLine()) != null) {

            //punctuation and spaces don't matter because we have to compare character by character. so i ignored them
            //so,i used replaceAll function
            String characters = line.toLowerCase().replaceAll("[\\W]", "");

            for (int i = 0; i < characters.length(); i++) {
                myStack.push(characters.charAt(i));
            }

            String newString = "";
            //I put every character I extracted into an empty string
            while (!myStack.isEmpty()) {
                newString += myStack.pop();
            }

            //if all characters are equal given string is equal.
            if (characters.equals(newString)) {
                System.out.println('"' + line + '"' + " is a palindrome.");
            }
        }
        reader.close();
    }
}
