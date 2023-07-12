import java.util.Scanner;

public class BinaryTreeTraversals {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildTree(Node root) {
        int data;
        Scanner sc=new Scanner(System.in);
        data=sc.nextInt();
        root = new Node(data);

        System.out.println("Enter data ");
        if (data == -1) {
            return null;
        }
        System.out.println("Enter left Node of "+data+" : ");
        root.left = buildTree(root.left);
        System.out.println("Enter right Node of "+data+" : ");
        root.right = buildTree(root.right);
        return root;
    }

    public static void INORDER(Node root) {
        if (root == null) {
            return;
        }
        INORDER(root.left);
        System.out.print(root.data+" ");
        INORDER(root.right);
    }
    public static void PREORDER(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        PREORDER(root.left);
        PREORDER(root.right);
    }

    public static void POSTORDER(Node root) {
        if (root == null) {
            return;
        }
        POSTORDER(root.left);
        POSTORDER(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {

        Node root = null;
        System.out.print("Enter Root Node : ");
        root = buildTree(root);

        System.out.print("INORDER : ");
        INORDER(root);

        System.out.print("\nPREORDER : ");
        PREORDER(root);

        System.out.print("\nPOSTORDER : ");
        POSTORDER(root);
    }
}