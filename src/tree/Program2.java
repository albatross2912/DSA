package tree;

public class Program2 {

    Node root;

    void preOrder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data+"\t");
            preOrder(root.left);
            preOrder(root.right);

        }

    }
    void InOrder(Node root)
    {
        if (root != null)
        {

            InOrder(root.left);
            System.out.print(root.data+"\t");
            InOrder(root.right);

        }
    }
    void postOrder(Node root)
    {
        if (root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"\t");
        }
    }

    public static void main(String[] args) {

        Program2 p1 = new Program2();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);

        System.out.println( "Pre-order :" );
        p1.preOrder(p1.root);
        System.out.println();
        System.out.println( "In-order :" );
        p1.InOrder(p1.root);
        System.out.println();
        System.out.println( "Post-order :");
        p1.postOrder(p1.root);

    }
}
