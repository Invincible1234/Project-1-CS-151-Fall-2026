package test;

import kthSmallestElement.KthSmallestElement;

public class KthSmallestElementTest {
    public static void main(String[] args) {
        KthSmallestElement s = new KthSmallestElement();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.left.right = new TreeNode(2);
        System.out.println(s.kthSmallest(root1, 1) == 1);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.left.right = new TreeNode(2);
        System.out.println(s.kthSmallest(root2, 3) == 3);

        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(3);
        root3.right = new TreeNode(6);
        root3.left.left = new TreeNode(2);
        root3.left.right = new TreeNode(4);
        root3.left.left.left = new TreeNode(1);
        System.out.println(s.kthSmallest(root3, 3) == 3);

        TreeNode root4 = new TreeNode(1);
        System.out.println(s.kthSmallest(root4, 1) == 1);

        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(1);
        System.out.println(s.kthSmallest(root5, 2) == 2);
    }
}
