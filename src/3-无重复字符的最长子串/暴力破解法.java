class Solution {
     public int lengthOfLongestSubstring(String s) {
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if(getScore(s.substring(i, j))){
                    score = Math.max(j - i, score);
                }
            }
        }
        return score;
    }

    public static boolean getScore(String subString) {
        Set<Character> set = new HashSet<>(32);

        for (int i = 0; i < subString.length(); i++) {
            if(set.contains(subString.charAt(i))){
                return false;
            }
            set.add(subString.charAt(i));
        }
        return true;
    }
}