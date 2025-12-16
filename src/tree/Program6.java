package tree;

//Create the mirror image of tree

public class Program6 {

    Node root;

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);

        }

    }

    void mirror(Node root) {
        if (root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);
        root.data = root.right.data;
        root.data = root.left.data;
        root.data = root.left.data;
        root.data = root.right.data;


    }






    public static void main(String[] args) {

        Program6 p1 = new Program6();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);

        System.out.println("Pre-order: ");
        p1.preOrder(p1.root);
        System.out.println();
        p1.mirror(p1.root);
        System.out.println();


    }
}



