class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));
            
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(c2)) {
                right--;
            } 
            else {
                if (c1 != c2) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
