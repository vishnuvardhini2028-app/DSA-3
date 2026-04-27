/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import static tree.MainTree.preorder;


public class MainTree {
    

    
    public static void main(String[] args) 
    {
        Node n1=new Node(10);
        Node child1=new Node(5);
        Node child2=new Node(20);
        Node grandchild1=new Node(3);
        Node grandchild2=new Node(7);
        System.out.println("node created");
        
        
        
       //  connecting a node
        n1.left=child1;
        n1.right=child2;
        
        child1.left=grandchild1;
        child1.right=grandchild2;
        
        System.out.println("preorder");
        MainTree.preorder(n1);
        System.out.println("");
        System.out.println("inorder");
        MainTree.inorder(n1);
        System.out.println("");
        System.out.println("postorder");
        MainTree.postorder(n1);
        
        
        
    }
    
//   ************ POSTORDER********************* 
    
    public static void preorder(Node n1)
    {
        if(n1==null)
        {
            return;
        }
        System.out.print(n1.data + " ");
        System.out.print(" ");
        preorder(n1.left);
        preorder(n1.right);
    }
//    **************INORDER******************
    
    public static void inorder(Node n1)
    {
        if(n1==null)
        {
            return;
        }
        inorder(n1.left);
        System.out.print(n1.data + " ");
        System.out.print(" ");
        inorder(n1.right);
    }
    
//    *********** POSTORDER*******************
    
    public static void postorder(Node n1)
    {
        if(n1==null)
        {
            return;
        }
        postorder(n1.left);
        postorder(n1.right);
        System.out.print(n1.data + " ");
        System.out.print(" ");
    }
    
    
    
}
