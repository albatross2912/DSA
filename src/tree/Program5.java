package tree;

//Check the binary tree is the complete binary tree or not.


public class Program5 {

    Node root;

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);

        }

    }

    private boolean checkFullBT(Node root) {
        if (root == null)

            return true;

        else if (root.left == null && root.right == null)
            return true;
        else if (root.left != null && root.right != null)
            return (checkFullBT(root.left) && checkFullBT(root.right));
        return false;


    }

    private boolean checkcompleteBT(Node root, int index, int count) {
        if (root == null)
            return true;
        if (index >= count)
            return false;

        return checkcompleteBT(root.left, (2 * index) + 1, 6) && checkcompleteBT(root.right, (2 * index) + 2, 6);

    }


    public static void main(String[] args) {

        Program5 p1 = new Program5();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);

        System.out.println("Pre-order: ");
        p1.preOrder(p1.root);
        System.out.println();

        System.out.println("Is Tree CompleteBT: " + p1.checkcompleteBT(p1.root, 0, 6));

    }
}



