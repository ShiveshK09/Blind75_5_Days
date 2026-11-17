https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
//////////////////////for Ignore spaces and case like "A gentleman" and "Elegant man" to be anagrams://///
       s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();
 ////////////////////////////////////////////////////////////////////////////////////////////////////     
        if(s.length()!=t.length()) return false;
        int[] ch=new int[256];//Support spaces and uppercase/lowercase letters
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;
            ch[t.charAt(i)]--;
        }
        for(int i:ch) if(i!=0) return false;
        return true;
    }  
}
//not valid for anagram with space
