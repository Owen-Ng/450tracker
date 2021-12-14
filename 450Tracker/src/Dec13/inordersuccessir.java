package Dec13;
class Solution {

	  static class Node {
	      
	    int key;
	    Node left;
	    Node right;
	    Node parent;
	    
	    Node(int key) {
	      this.key = key;
	      left = null;
	      right = null;
	      parent = null;
	    }
	  }
	  
	  static class BinarySearchTree {
	    
	    Node root;

	    Node findInOrderSuccessor(Node inputNode) {
	      // your code goes here 
	      // if node has parent and the parent left node is the one then the successor is the parent
	      // if node has parent but they are from the left, then u need to go to the furthest
	      // left until u have a parents that is right
	      if (inputNode.right != null){
	        Node r = inputNode.right;
	        while(r.left != null){
	          r = r.left;
	        }
	        return r;
	      }else{
	        Node up = inputNode.parent;
	        Node prev = inputNode;
	        System.out.println(up.right == prev);
	        while(up.right == prev){
	          System.out.println('1');
	          prev = prev.parent;
	          up = up.parent;
	        }
	        return up;
	      }
	    }
	    
	    //  Given a binary search tree and a number, inserts a new node
	    //  with the given number in the correct place in the tree
	    void insert(int key) {
	      
	      // 1. If the tree is empty, create the root
	      if(this.root == null) {
	        this.root = new Node(key);
	        return;
	      }

	      // 2) Otherwise, create a node with the key
	      //    and traverse down the tree to find where to
	      //    to insert the new node
	      Node currentNode = this.root;
	      Node newNode = new Node(key); 

	      while(currentNode != null) {
	        if(key < currentNode.key) {
	          if(currentNode.left == null) {
	            currentNode.left = newNode;
	            newNode.parent = currentNode;
	            break;
	          } else {
	            currentNode = currentNode.left;
	          }
	        } else {
	          if(currentNode.right == null) {
	            currentNode.right = newNode;
	            newNode.parent = currentNode;
	            break;
	          } else {
	            currentNode = currentNode.right;
	          }
	        }
	      }
	    }
	    
	    // Return a reference to a node in the BST by its key.
	    // Use this method when you need a node to test your 
	    // findInOrderSuccessor method on
	    Node getNodeByKey(int key) {
	      Node currentNode = this.root;
	      
	      while(currentNode != null) {
	        if(key == currentNode.key) {
	          return currentNode;
	        }
	        
	        if(key < currentNode.key) {
	          currentNode = currentNode.left;
	        } else {
	          currentNode = currentNode.right;
	        }
	      }
	      
	      return null; 
	    }
	  }
	  
	  /***********************************************
	   * Driver program to test findInOrderSuccessor *
	   ***********************************************/

	  public static void main(String[] args) {
	     
	    Node test = null, succ = null;
	     
	    // Create a Binary Search Tree
	    BinarySearchTree tree = new BinarySearchTree();
	    tree.insert(20);
	    tree.insert(9);
	    tree.insert(25);
	    tree.insert(5);
	    tree.insert(12);
	    tree.insert(11);
	    tree.insert(14);
	     
	    // Get a reference to the node whose key is 9
	    test = tree.getNodeByKey(14);

	    // Find the in order successor of test
	    succ = tree.findInOrderSuccessor(test);
	     
	    // Print the key of the successor node
	    if (succ != null) {
	      System.out.println("Inorder successor of " + test.key +
	                          " is " + succ.key);
	    } else {
	      System.out.println("Inorder successor does not exist");
	    }
	  }
	}
public class inordersuccessir {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
	}

}
