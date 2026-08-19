class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        else{
            StringBuilder ans = new StringBuilder();
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];int i = 0;
            while (i < first.length() && i < last.length()) {
                if (first.charAt(i) == last.charAt(i)) {
                    ans.append(first.charAt(i));
                    i++;
                } else {
                    break;
                }
            }
            return ans.toString();
        }
    }
}