/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: FileIO class, this class reads a file called pal.txt, then this class
through the use of while and for loops is able to determine if a line of text is a palindrome.
If the line of text is a palindrome that palindrome will be sent to a palindrome 
queue and this palindrome queue will be sent to a new txt file called palidrome.txt.
 */
package project4appofqueues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FileIO <T> extends Queue
{
    
/*
Function: readFile
Author: Nicholas Johnson
Description: This method reads one line of text at a time, from a file called pal.txt
The line of text is saved to a String variable reference, then the method turns all
characters in the text to lower case letters, and removes all whitespaces, then is stored in a 
new String variable replaceLine. A for loop is used to loop through the String replaceLine,
each charcter is pushed onto a Stack, and also enqueued onto a queue. Another for loop
is then set into motion if the pop and dequeue are equal then increment a count variable by
one. After the for loop is done, an If statement is then activated, and if the count variable
is equal to replaceLine length, The reference variable that was saved in the beginning of
the while loop will be enqueued into a palindrome queue. Reset the count variable and return
to the top of the while loop, to read another line of text. After all lines have been read,
writeFile method is called passing the parameter palindrome queue.
Inputs: No inputs
Outputs: Queue of palindromes
*/      
    
    public void readFile()
    {
        FileReader fr = null;
        BufferedReader br = null;

        try
        {
            fr = new FileReader("pal.txt");
            br = new BufferedReader(fr);
            String line;
            String reference;
            int count = 0;
            
            Stack reader = new Stack();
            Queue palindrome = new Queue();
            
            while((line = br.readLine()) != null)
            {
                reference = line;
                
                line = line.toLowerCase();
                char[] chars = line.toCharArray();
                String replaceLine = "";
                
                for(int i = 0; i < chars.length; i++)
                {
                    if(chars[i] != ' ')
                    {
                        replaceLine = replaceLine + chars[i];
                    }
                    else
                    {
                        replaceLine = replaceLine;
                    }
                    
                }
                
                for(int i = 0; i < replaceLine.length(); i++)
                {
                    reader.push(replaceLine.charAt(i));
                    this.enQueue(replaceLine.charAt(i));
                }
              
                for(int i = 0; i < replaceLine.length(); i++)
                {
                    if(this.deQueue() == reader.pop())
                    {
                        count++;
                    }
                }
                
                if(count == replaceLine.length())
                {
                    palindrome.enQueue(reference);
                }
                
                count = 0;
            }

            writeFile(palindrome);
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
           
        }
    }
    
/*
Function: writeFile
Author: Nicholas Johnson
Description: Writes to a file: palindrome.txt
Inputs: This method takes in a Queue as a parameter, the palindrome queue sent from the 
readFile method.
Outputs: Creates a new text file called palindrome.txt that has all the palindromes from the pal.txt file
*/      
    
    public void writeFile(Queue palindrome)
    {
        PrintWriter pw = null;
        FileWriter fw = null;
        
        try
        {
            fw = new FileWriter("palindrome.txt");
            pw = new PrintWriter(fw);
            
            while(palindrome != null)
            {
                pw.println(palindrome.deQueue());
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                fw.close();
                pw.close();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        
    }
    
/*
Function: readPalindromeFile
Author: Nicholas Johnson
Description: Simply reads the palindrome file
Inputs: No inputs. Method is called from main
Outputs: Outputs the palindrome.txt file one line at a time.
*/      
    
    public void readPalindromeFile()
    {
        FileReader fr = null;
        BufferedReader br = null;

        try
        {
            fr = new FileReader("palindrome.txt");
            br = new BufferedReader(fr);
            String line;
          
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
           
        }
    }
}
