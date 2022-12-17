/* Nicholas Johnson
 * 10/6/2019
 * Data Structurs: CSIS-211
 * Student ID: 0505878
Description: Node class. Generic class. This class has a public default constructor
as well as public data section. This is so the other classes in the program can access
the data section of this class. The data section here stores the node pairs and 
makes it easy to search through a node.
 */
package project4appofqueues;


public class Node<T>
{
/*
Function: Data section
Author: Nicholas Johnson
Description: Three variables. Nodes and Generic type
Inputs: Holds data
Outputs: Next/Prev will hold Node data, Data will hold generic type data
*/  
    public T Data;
    public Node Next;
    public Node Prev;
    public int pri;
    
/*
Function: Node
Author: Nicholas Johnson
Description: Constructor
Inputs: No inputs, made public
Outputs: Allows other classes to use the data section
*/  
    
    public Node()
    {
        
    }   
    
}
