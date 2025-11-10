package DSA.Trees;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println("Height of binery tree in Nodes "+ findHeight(root));
        System.out.println("Height of binery tree in Edges "+ (findHeight(root)-1));
    }

    private static int findHeight(Node root) {
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
class Node{
    int data;
    Node left, right;
    Node(int value){
        data = value;
        left = right = null;
    }
}
