package test;

import kthSmallestElement.KthSmallestElement;
import kthSmallestElement.TreeNode;

public class KthSmallestElementTest {
    public static void main(String[] args) {
    	
    	// Volodymir Surin 
    	
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
        
        // Thaneesha Singh
        
        KthSmallestElement t = new KthSmallestElement();
        
        TreeNode root6 = new TreeNode(5);
        root6.left = new TreeNode(3);
        root6.right = new TreeNode(6);
        
        System.out.println(t.kthSmallest(root6, 1) == 3);
        
        TreeNode root7 = new TreeNode(10);
        root7.left = new TreeNode(1);
        root7.right = new TreeNode(20);
        root7.left.right = new TreeNode(2);
        
        System.out.println(t.kthSmallest(root7, 1) == 1);
        
        TreeNode root8 = new TreeNode(9);
        root8.left = new TreeNode(3);
        
        System.out.println(t.kthSmallest(root8, 2) == 9);
        
        TreeNode root9 = new TreeNode(12);
        
        System.out.println(t.kthSmallest(root9, 1) == 12);
        
        TreeNode root10 = new TreeNode(14);
        root10.left = new TreeNode(12);
        root10.left.left = new TreeNode(10);
        root10.left.left.left = new TreeNode(8);
        
        System.out.println(t.kthSmallest(root10, 3) == 12);
        
    }
}
