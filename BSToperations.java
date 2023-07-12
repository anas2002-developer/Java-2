//import java.util.Scanner;
//
//public class BSToperations {
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static Node Insert(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        } else if (data < root.data) {
//            root.left = Insert(root.left, data);
//        } else {
//            root.right = Insert(root.right, data);
//        }
//        return root;
//    }
//
//    public static Node miniSuccessor(Node root) {
//        Node curr = root;
//
//        while (curr.left != null) {
//            curr = curr.left;
//        }
//        return curr;
//    }
//
//    public static Node Delete(Node root, int data) {
//        if (root == null) {
//            return root;
//        } else if (root.data == data) {
//            if (root.left == null && root.right == null) {
//                delete root;
//                return null;
//            } else if (root.left != null && root.right == null) {
//                Node temp = root.left;
//                delete root;
//                return temp;
//            } else if (root.left == null && root.right != null) {
//                Node temp = root.right;
//                delete root;
//                return temp;
//            } else {
//                int mini = miniSuccessor(root.right).data;
//                root.data = mini;
//                root.right = Delete(root.right, mini);
//                return root;
//            }
//        } else if (data < root.data) {
//            root.left = Delete(root.left, data);
//            return root;
//        } else {
//            root.right = Insert(root.right, data);
//            return root;
//        }
//    }
//
//    public static boolean SearchRecursion(Node root, int x) {
//        if (root == null) {
//            return false;
//        } else if (x == root.data) {
//            return true;
//        } else if (x < root.data) {
//            return SearchRecursion(root.left, x);
//        } else {
//            return SearchRecursion(root.right, x);
//        }
//    }
//
//    public static boolean SearchIteration(Node root, int x) {
//        Node curr = root;
//
//        while (curr != null) {
//            if (curr == null) {
//                return false;
//            } else if (x == curr.data) {
//                return true;
//            } else if (x < curr.data) {
//                curr = curr.left;
//            } else {
//                curr = curr.right;
//            }
//        }
//        return false;
//    }
//
//    public static void INORDER(Node root) {
//        if (root == null) {
//            return;
//        }
//        INORDER(root.left);
//        System.out.print(root.data + " ");
//        INORDER(root.right);
//    }
//
//    public static void inputValues(Node root) {
//        int data;
//        Scanner sc = new Scanner(System.in);
//        data = sc.nextInt();
//
//        while (data != -1) {
//            Insert(root, data);
//            data = sc.nextInt();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Node root = null;
//        System.out.println("Insert values :\n");
//        inputValues(root);
//
//        System.out.println();
//        System.out.println(SearchRecursion(root, 5));
//        System.out.println(SearchIteration(root, 10));
//
//        root = Delete(root, 20);
//
//        System.out.print("INORDER : ");
//        INORDER(root);
//    }
//}
//
////functions -
////1. Insert
////2. MiniSuccessor
////3. Delete
////4. SearchRecursion
////5. SearchIteration
////6. Inorder
////7. InputValues