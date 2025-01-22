public class Day_10 {
    public static void main(String[] args) {
        int nums1[] = {2,5,1,6,54,9};
        int nums2[] = {3,4,8,7,12,10,11};
    
    }    
        
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] newArr = new int[m+n];
            int p1 = 0;
            int p2 = 0;
            int idx = 0;

            while(p1<m && p2<n){
                if(nums1[p1] <= nums2[p2]){
                    p1++;
                    newArr[idx] = nums1[p1];
                }else{
                    newArr[idx] = nums2[p2];
                    p2++;
                }
            }

            
        }
    
    
}
