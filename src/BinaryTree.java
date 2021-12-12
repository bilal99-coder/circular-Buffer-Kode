public class BinaryTree {

    class BinaryTreeNode{
        char value;
        BinaryTreeNode left_child;
        BinaryTreeNode right_child;


        public BinaryTreeNode(char value){
            this.value = value;
            this.left_child = null;
            this.right_child = null;
        }

        void addLeftChild(char value){
            this.left_child = new BinaryTreeNode(value);
        }

        void addRightChild(char value){
            this.right_child = new BinaryTreeNode(value);
        }

    }
}
