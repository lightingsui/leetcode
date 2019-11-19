class Solution {
     public int lengthOfLongestSubstring(String s) {
        int score = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>(32);

        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                score = Math.max(j- i + 1, score);
                set.add(s.charAt(j++));
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return score;
    }
}