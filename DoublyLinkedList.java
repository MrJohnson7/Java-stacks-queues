/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: DoublyLinkedList class. Generic class. This class is able save a list using a node.
This class is also the mother class to the Stack /Queue classes. Data section is a node that holds
the head and tail of the list that takes in Generic type T. This class has functionality to create a list, add/delete
from the list, as well as insert new data to a specific location in the list. This class
can also print the list.
 */
package project4appofqueues;

/*
Function: Class: DoublyLinkedList 
Author: Nicholas Johnson
Description: LinkedList is a generic class T
Inputs: Recieves generic types
Outputs: Puts the input it recieves into a list/node
*/     

public class DoublyLinkedList <T>
{
    
/*
Function: Data section: Generic type Node called Head and Tail
Author: Nicholas Johnson
Description: This will be where the data gets saved to
Inputs: Recieves data, Integer/Double/Character/String
Outputs: Turns the data into a list/node
*/   
    
    Node<T>  Head = null;
    Node<T> Tail = null;
    
    
/*
Function: addNode
Author: Nicholas Johnson
Description: Adds more data to the list
Inputs: Parameter named data: generic type
Outputs: Adds another line to the list/node of what data is equal to
*/  
    
    void addNode(T data)
    {
        if(Head == null)
        {
            Head = new Node();
            Head.Data =  data;
            Head.Next = null;
            
            Tail = Head;
        }
        else
        {
           Node p = this.Head;
           
           while(p.Next != null)
               p = p.Next;
           
           Node n = new Node();
           n.Data =  data;
           n.Next = null;
           n.Prev = null;
           
           p.Next = n;
           n.Prev = p;
           Tail = n;
        }
    }
    
/*
Function: printList
Author: Nicholas Johnson
Description: Prints to output screen the list
Inputs: Void method, no parameters
Outputs: When method is called it prints the Node as a list to output screen
*/        
    
    public void printList()
    {
        Node <T> p = this.Head;
            
        while(p != null)
        {
            System.out.println(p.Data);
            p = p.Next;
                        
        }
    }
    
/*
Function: printBackward
Author: Nicholas Johnson
Description: Prints to output screen the list backwards
Inputs: Void method, no parameters
Outputs: When method is called it prints the Node as a list to output screen backwards
*/  
    
    public void printBackward()
    {
        Node<T> p = this.Tail;
        
        while(p != null)
        {
            System.out.println(p.Data);
            p = p.Prev;
                        
        }
        
    }
/*
Function: insert
Author: Nicholas Johnson
Description: Inserts new data to the list
Inputs: Two parameters: search, and value. Searches for what the parameter search is equal too
Outputs: Once search finds a match the method will insert what the parameter
    - value is equal too directly behind the search value
*/         
    
    public void insert(T search, T data)
    {
        Node <T> p = this.Head;
        while(p.Data != search)
        {
            p = p.Next;
        }
        
        Node<T> n = new Node<T>();
        n.Data = data;
        
        n.Next = p.Next;
        n.Prev = p;
        p.Next.Prev = n;       
        p.Next = n;
    }
/*
Function: deleteNode
Author: Nicholas Johnson
Description: Searches and deletes a specific part of the list
Inputs: The parameter search is used to look for a specific part of the list
Outputs: Once the search finds the match of the parameter it will delete that
    - data from the list
*/      
  
    public void deleteNode(T search)
    {
        Node <T> p = this.Head;
        while(!p.Next.Data.equals(search))
        {
            p = p.Next;
        }
        Node delRef = p.Next;
        p.Next = p.Next.Next;
        delRef = null;
    }
/*
Function: addToEnd
Author: Nicholas Johnson
Description: Adds to the end of the list/node
Inputs: Generic type T called data
Outputs: Adds new data to the end of the list/node
*/      
    
    public void addToEnd(T data)
    {
        if(this.Head == null)
        {
            Node<T> n = new Node<T>();
            n.Data = data;
            n.Next = null;
            n.Prev = null;
            this.Tail = this.Head = n;
        }
        else
        {
        Node<T> p = this.Head;
       
        while(p.Next != null)
            p = p.Next;
            
        Node<T> n = new Node<T>();
        n.Data = data;
        n.Next = null;
        n.Prev = null;
        
        p.Next = n;
        n.Prev = p;
        this.Tail = n;
        }
        
    }
    
    public void setFront(T data)
    {
        Node<T> p = this.Head;
        if(this.Head == null)
        {
            Node<T> n = new Node<T>();
            n.Data = data;
            n.Next = null;
            n.Prev = null;
            this.Tail = this.Head = n;
        }
        else
        {
            Node<T> n = new Node<T>();
            n.Data = data;
            n.Next = this.Head;
            n.Prev = null;
            this.Head.Prev = n;
            this.Tail = p;
            this.Head = n;
        }
        
    }

/*
Function: insertAt
Author: Nicholas Johnson
Description: Inserts new data at a specific location
Inputs: Two parameter Integer index and generic type T called data
Outputs: Inserts new data to the node at the specific index passed in from parameter
*/      
    
    public void insertAt(int index, T data)
    {
        Node <T> p = this.Head;
        for(int i = 0; i != index; i++)
        {
           p = p.Next;
        }
        
        Node<T> n = new Node<T>();
        n.Data = data;
        
        n.Next = p.Next;
        n.Prev = p;
        p.Next.Prev = n;       
        p.Next = n;
    }
    
/*
Function: getFront
Author: Nicholas Johnson
Description: Gets the front of the list
Inputs: No inputs
Outputs: When called returns the Head section of the data
*/      
    
    public T getFront()
    {
        return (T) this.Head.Data;
    }
    
/*
Function: getRear
Author: Nicholas Johnson
Description: Gets the data from the back of the list
Inputs: No inputs
Outputs: When called returns the Tail section of the data
*/      
    
    public T getRear()
    {
        return (T) this.Tail.Data;
    }
    
/*
Function: deleteEnd
Author: Nicholas Johnson
Description: Deletes the element at the end of the list
Inputs: No input
Outputs: When called it sets tail to null which then deletes null
*/  
    
    public void deleteEnd()
    {
        this.Tail = null;
    }
    
    
}
