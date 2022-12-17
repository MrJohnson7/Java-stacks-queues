/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: Stack class is using inhertance from the Doubly Linked list class
This class allows to add, retrieve, and delete data from a list with the use nodes.
This class is also the mother class to the RPNCalculator class.
 */
package project4appofqueues;


public class Stack <T> extends DoublyLinkedList
{
    
/*
Function: push
Author: Nicholas Johnson
Description: Pushes element onto the stack
Inputs: Complex type T called elem
Outputs: Adds to the stack
*/  
    
    public void push(T elem)
    {
        this.setFront(elem);
    }
    
/*
Function: peek
Author: Nicholas Johnson
Description: Lets us see whats on top of the Stack
Inputs: No input, is directly linked to the stack
Outputs: Return whats at top of the stack
*/      
    
    public T peek() //"Returns data from the top of the stack without removing it
    {
       if (this.Head != null)
       {
           return (T) this.Head.Data;
       }
       return null;
       
    }
    
/*
Function: pop
Author: Nicholas Johnson
Description: Deletes data
Inputs: No input, is directly linked to the stack
Outputs: Deletes the top of the Stack
*/  
    
    public T pop() // "Removes data from the top of the stack"
    {
       Node<T> temp = new Node<T>();
       temp.Data = (T) Head.Data;
       
       if (Head.Data != null)
       {
          Head = Head.Next;
          Tail.Prev = null;
          return (T) temp.Data;
       }
       return null;
    }    
    
}
