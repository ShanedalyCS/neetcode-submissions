class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        HashMap<String, List<String>> map = new HashMap<>();
        
        List<List<String>> finalList = new ArrayList<>();

        for(int i = 0; i < strs.length; i++)
        {
            char [] s = strs[i].toCharArray();

            Arrays.sort(s);

            String sSorted = String.valueOf(s);

            if(map.containsKey(sSorted)){

                List<String> tempList = new ArrayList<>();
                tempList = map.get(sSorted);
                tempList.add(strs[i]);

                finalList.remove(tempList);

                map.put(sSorted, tempList);

                finalList.add(map.get(sSorted));

            }
            else{
                
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(sSorted, tempList);

                finalList.add(map.get(sSorted));

            }
        }

        // for(String s : map)
        // {
        //     finalList.add(map.get(s));
        // }

        return finalList;
    }
}
