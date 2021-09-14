import java.util.Arrays;

public class solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
            
        }
        Arrays.sort(nums1);
    }
    

     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
    }
}
