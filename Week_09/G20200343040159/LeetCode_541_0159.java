/**
*541. 反转字符串 II
*https://leetcode-cn.com/problems/reverse-string-ii/
*/
class Solution {
   public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int left = 0, step = 2 * k; left < arr.length; left += step) {
            int right = Math.min(arr.length - 1, left + k - 1);
            swap(arr, left, right);
        }
        return new String(arr);
    }
    private void swap(char[] arr, int left, int right) {
        while (left < right) {
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left++] ^= arr[right--];
        }
    }

}