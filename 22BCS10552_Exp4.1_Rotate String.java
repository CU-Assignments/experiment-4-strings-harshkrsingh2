//22BCS10552
//Harsh Kumar Singh
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s == null || goal == null || s.length() != goal.length()) {
            return false;
        }
        
        if (s.equals(goal)) {
            return true;
        }
        
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            char first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];}
            arr[arr.length - 1] = first;
            
            if (String.valueOf(arr).equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
