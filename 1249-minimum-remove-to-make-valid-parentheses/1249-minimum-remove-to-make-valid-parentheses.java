
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) continue;
                count--;
            }
            sb.append(c);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && count > 0) {
                count--;
            } else {
                ans.append(c);
            }
        }

        return ans.reverse().toString();
    }
}
