/* Problem Statement:
You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.
*/

class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == -1) {
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}
