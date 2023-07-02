/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        for(var leftmost=root; leftmost != null; leftmost = leftmost.left){
            for(var lvl = leftmost; lvl!= && lvl.left!= null; lvl=lvl.next){
                lvl.left.next = lvl.right;
                if(lvl.next != null){
                    lvl.right.next = lvl.next.left;
                }
            }
        }
        /*
        if(root == null){
            return null;
        }

        while(root.left != null){
            root.left.next = root.right;
            root.left = root.left.right;
            root.right = root.right.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
        /*
    }
}