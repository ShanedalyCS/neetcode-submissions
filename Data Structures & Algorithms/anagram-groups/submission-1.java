class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for(String s : strs){
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
            
                map.put(key, new ArrayList<>());    
            }
            map.get(key).add(s);
            
            
        }
        
        
        ArrayList<List<String>> answer = new ArrayList<List<String>>();
        return new ArrayList<>(map.values());
    }
}
