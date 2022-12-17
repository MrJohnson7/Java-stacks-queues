/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: This program reads lines of text from a text file: "pal.txt". 
Then seperates the palindromes from the file using a queue specifically meant to 
hold the palindromes. Readpalindromefile is called and the program outputs all the palindromes
that were sent to the palindrome queue.
 */
package project4appofqueues;


public class Project4AppOfQueues 
{

    
    public static void main(String[] args) 
    {
        System.out.println("Reading file: pal.txt....");
        System.out.println("Seperating palindromes...");
        System.out.println("Palindromes go to new file: palindromes.txt" + "\n");
        FileIO test = new FileIO();
        System.out.println("Reading/print file: palindromes.txt" + "\n");
        test.readFile();
        test.readPalindromeFile();
        
    }
    
}
