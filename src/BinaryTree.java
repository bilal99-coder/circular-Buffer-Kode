public class BinaryTree {

    static class BinaryTreeNode{
        char value;
        BinaryTreeNode left_child;
        BinaryTreeNode right_child;


        public BinaryTreeNode(char value){
            this.value = value;
            this.left_child = null;
            this.right_child = null;
        }

        BinaryTreeNode addLeftChild(char value){
            this.left_child = new BinaryTreeNode(value);
            return this.left_child;
        }
        BinaryTreeNode  addRightChild(char value){
            this.right_child = new BinaryTreeNode(value);
            return this.right_child;
        }

    }

    public static void main (String [] args) {
        //Legger til rot - noden (Nivå 0)
        BinaryTreeNode root = new BinaryTreeNode('A');

        //Legg inn resterende noder på nivå 1
        BinaryTreeNode b = root.addLeftChild('B');
        BinaryTreeNode c = root.addRightChild('C');

        //Legg inn resterende noder på nivå  2
        BinaryTreeNode d = b.addLeftChild('D');
        BinaryTreeNode e = b.addRightChild('E');

        BinaryTreeNode f = c.addLeftChild('F');
        BinaryTreeNode g = c.addRightChild('G');

        //Legg inn resterende noder på nivå  3
        BinaryTreeNode h = d.addLeftChild('H');
        BinaryTreeNode i = d.addRightChild('I');

        BinaryTreeNode j = e.addLeftChild('J');
        BinaryTreeNode k = e.addRightChild('K');

        BinaryTreeNode l = f.addLeftChild('L');
        BinaryTreeNode m = f.addRightChild('M');

        BinaryTreeNode n = g.addLeftChild('N');
        BinaryTreeNode o = g.addRightChild('O');

    }
}
