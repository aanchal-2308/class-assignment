import java.util.*;

public class Assignment

{

    static class Node

    {
        int data;
 
             Node left,right;
 
             public Node(int item)

            {
            data=item;
    
                         left=right=null;
    
        }
   
   };
    Node root;
  
  public Assignment()
   
  {
        
            root=null;
        
  
  }
 
    static int height(Node root)

    {
      
         if(root==null)
  
         {
          
             return 0;
    
         }
     
        else
     
       {
            
          int lheight=height(root.left);
  
          int rheight=height(root.right);
 
          if(lheight>=rheight)

            return lheight+1;
 
           else
       
         return rheight+1;
   
        }
 
   }
   
     static void print(Node root)
    
    {
        int h=height(root);
  
      //System.out.println("height:"+h);

        for(int i=1;i<=h;i++)
    
        {
          
            printLeftLevel(root,i);
    
        }
  
        for(int i=1;i<=h;i++)
  
        {
          
            printRightLevel(root,i+1);
   

        }
    
     }
   
    static void printLeftLevel(Node root,int level)
 
   {
        
        if(root==null)
 
        return;
 
        if(level==1)
 
       {
       
               System.out.print(root.data+" ");
    
       }

        else if(level>1)

        {
            
             printLeftLevel(root.left,level-1);
   
        }

    }
    static void printRightLevel(Node root, int level)
 
          {
        
             if(root==null)
        
               return;
        
             if(level==1)
        
              {
           
                System.out.print(root.data+" ");
       
              }
        
             else if( level>1)
        
             {
           
                printRightLevel(root.right,level-1);
        
             }
        
        
   
          }
    
    
       public static void main(String args[])
   
      {
        Node root=null;
    
             root=new Node(40);
     
            root.left=new Node(30);
      
            root.left.left=new Node(20);
       
             root.left.right=new Node(35);
      
            root.right=new Node(70);
      
            root.right.left=new Node(50);
      
           root.right.right=new Node(80);
       
            print(root);
   
      }

}