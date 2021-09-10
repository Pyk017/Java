package string;

import java.util.Scanner;
import string.variants.*;

public class Driver {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("\nEnter options for :- \n"
            + "1 to count the total number of characters in a String.\n"
            + "2 to count the total number of punctuation characters exists in a String.\n"
            + "3 to count the total number of vowels and consonants in a String.\n"
            + "4 to determine whether two strings are the anagram of each other or not.\n"
            + "5 to divide a string into 'N' equal parts.\n"
            + "6 to print all subsets of the String.\n"
            + "7 to print all the permutations of the String.\n"
            + "8 to print remove all the whitespaces in the string.\n"
            + "9 to replace lower-case characters to upper-case characters and vice-versa.\n"
            + "10 to check if the String is Palindrome or not.\n"
            + "11 to determine whether one string is a rotation of another string.\n"
            + "12 to find maximum and minimum occuring character in a string.\n"
            + "q to exit!\n");

            String option = scan.nextLine();

            if (option.charAt(0) == 'q') {
                break;
            } else {

                switch (option) {
                    case "1":
                        String string = getInput("Enter String :- ");
                        String result = NumberOfCharacters.countOfCharacters(string);
                        showOutput(result, "The count of Characters in your String is :- ");
                        break;
                    case "2":
                        string = getInput("Enter String :- ");
                        result = NumberOfPunctuations.countOfPunctuations(string);
                        showOutput(result, "The count of Punctuations in your String is :- ");
                        break;
                    case "3":
                        string = getInput("Enter String :- ");
                        String resultVow = VowelConsonants.getCountOfVowel(string);
                        String resultCons = VowelConsonants.getCountOfConsonants(string);
                        showOutput(resultVow, "Vowels are :- ");
                        showOutput(resultCons, "Consonants are :- ");
                        break;
                    case "4":
                        string = getInput("Enter Strings(separated by a whitespace) :- ");
                        boolean isAna = Anagram.isAnagram(string);
                        showOutput(String.valueOf(isAna), "ANAGRAM :- ");
                        break;
                    case "5":
                        string = getInput("Enter String :- ");
                        int n = Integer.parseInt(getInput("Enter value of N :- "));
                        boolean res = NParts.nParts(string, n);
                        showOutput(String.valueOf(res), "N Parts :- ");
                        break;
                    case "6" :
                        string = getInput("Enter String :- ");
                        res = Subsets.printSubsets(string);
                        showOutput(String.valueOf(res), "SUBSETS :- ");
                        break;
                    case "7":
                        string = getInput("Enter String :- ");
                        res = Permutations.printPermutations(string);
                        showOutput(String.valueOf(res), "PERMUTATIONS :- ");
                        break;
                    case "8":
                        string = getInput("Enter String :- ");
                        result = RemoveWhiteSpace.removeWhitespace(string);
                        showOutput(result, "RESULTANT STRING(without whitespaces) :- ");
                        break;
                    case "9":
                        string = getInput("Enter String :- ");
                        result = SwapCases.swapCases(string);
                        showOutput(result, "RESULTANT STRING :- ");
                        break;
                    case "10":
                        string = getInput("Enter String :- ");
                        res = Palindrome.isPalindrome(string);
                        showOutput(String.valueOf(res), "PALINDROME :- ");
                        break;
                    case "11":
                        string = getInput("Enter String :- ");
                        res = RotationOfAnother.checkRotation(string);
                        showOutput(String.valueOf(res), "ROTATED STRING and ORIGINAL STRING are EQUAL:- ");
                        break;
                    case "12":
                        string = getInput("Enter String :- ");
                        result = MaxMinCharacter.findMaxMinChar(string);
                        showOutput(result, "");
                        break;
                    default: 
                        System.out.println("Invalid option input!");
                        break;
                }

            }
            
        }

    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        String input = scan.nextLine();
        return input;
    }

    public static void showOutput(String result, String prompt) {
        System.out.println(prompt + result);
    }
}
