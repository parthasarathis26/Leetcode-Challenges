class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0"; // Special case for 0

        StringBuilder result = new StringBuilder();
        
        while (n != 0) {
            int r = n % -2;
            n = n / -2;
            
            if (r < 0) { // Adjust for negative remainder
                r += 2;
                n += 1;
            }
            
            result.append(r); // Append the digit
        }
        
        return result.reverse().toString(); // Reverse to get the correct order
    }
}
