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
        
        //in group solution
        /*
        for(var leftmost=root; leftmost != null; leftmost = leftmost.left){
            for(var lvl = leftmost; lvl!= null && lvl.left!= null; lvl=lvl.next){
                lvl.left.next = lvl.right;
                if(lvl.next != null){
                    lvl.right.next = lvl.next.left;
                }
            }
        }
        
        return root;
        
        */
        
        
        /*
            My incomplete sollution
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
        */
        
        if(root == null) return null;
        Node left = root.left;
        Node right = root.right;
        while(left != null){
            left.next = right;
            left = left.right;
            right = right.left;
        }
        connect(root.left);
        connect(root.right);
        return root;  
    }
    }
}