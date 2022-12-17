/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: Queue class is using inhertance from the Doubly Linked list class
This class allows to add, retrieve, and delete data from a list with the use nodes.
 */
package project4appofqueues;


public class Queue <T> extends DoublyLinkedList
{
/*
Function: enQueue
Author: Nicholas Johnson
Description: Adds an element to the end of the list
Inputs: Generic type T called elem
Outputs: Adds the data from parameter elem to the end of the list
*/      
    public void enQueue(T elem) //"enQueue- add data to the rear of the queue"
    {
        this.addToEnd(elem);
    }
    
/*
Function: deQueue
Author: Nicholas Johnson
Description: Removes from the top of the list
Inputs: No inputs
Outputs: When called it deletes a element from the list
*/      
     
    public T deQueue() // "Remove data from the front of the queue" 
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

/*
Function: peek
Author: Nicholas Johnson
Description: Gets data from the top of the list
Inputs: No inputs
Outputs: Returns the data from the top of list
*/      
     
    public T peek() // "Return data at front of queue without removing it
    {
       if (this.Head != null)
        {
           return (T) this.Head.Data;
        }
       return null;
    }    
    
    
}
