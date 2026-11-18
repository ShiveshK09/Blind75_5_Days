//https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            //char[] ch=new char[256];
            char[] ch=new char[26];
            for(char c:st.toCharArray()){
                //ch[c]++;
              ch[c-'a']++;
            }
        String s=new String(ch);
        if(!map.containsKey(s)) map.put(s,new ArrayList<>());
        map.get(s).add(st);
        }
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
