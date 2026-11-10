class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
                char [] sCharArray = strs[i].toCharArray();
                Arrays.sort(sCharArray);

                String back = new String(sCharArray);

               if(map.containsKey(back))
               {
                    List<String> strings = new ArrayList<>(map.get(back));
                    strings.add(strs[i]);
                    map.put(back, strings);
               } 
               else {
                    List<String> valueToAdd = new ArrayList<>();
                    valueToAdd.add(strs[i]);
                    map.put(back, valueToAdd);
               }
        }

        List<List<String>> finalList = new ArrayList<>(map.values());
        return finalList;

    }
}
