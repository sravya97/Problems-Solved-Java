class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int i = m - 1;
        int j = n - 1;
        int current = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[current--] = nums1[i--];
            } else{
                nums1[current--] = nums2[j--];
            }
        }
        while(i >= 0){
            nums1[current--] = nums1[i--];
        }
        while(j >= 0){
            nums1[current--] = nums2[j--];
        }
    }
}