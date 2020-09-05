package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new Node(8);

        /* following is the tree after above statement

              8
            /   \
          null  null     */

        tree.root.left = new Node(5);
        tree.root.right = new Node(20);

        /* 2 and 3 become left and right children of 1
               8
             /   \
            5      20
          /    \    /  \
        null null null null  */


        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(7);

        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(3);
        /* 4 becomes left child of 2
                    8
                /       \
               5          20
             /   \       /  \
            2    7  null  null
           /   \
          1     3
         */
    System.out.println(search(tree.root, 3).key);
    printPreorder(tree.root);

    }


    public static Node search(Node root, int key)
    {

        // Base Cases: root is null or key is present at root
        if (root==null){
            System.out.println("doesn't exist");
            return new Node(999999);
        }

        if(root.key==key){
            System.out.println("We made it....");
            return root;}

        System.out.println(root.key);
        // val is greater than root's key
        if (root.key > key)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }

    public static void printPreorder(Node node)
    {
        if (node == null){
            return;

        }
        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);



    }

    public static int printFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n*printFactorial(n-1);

    }


    // write your code here

}
