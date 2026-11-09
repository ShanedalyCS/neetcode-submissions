class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List <Integer>[] bucket = new List[nums.length+1];
        for (int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 0) ;
            }
            map.put(i, map.get(i)+1);

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
            System.out.println(bucket[freq]);
        }
        int [] answer = new int[k];
        int counter = 0;
        for(int freq = bucket.length-1; freq >= 1 && counter < k; freq--){
            if(!(bucket[freq] == null)){
                
                for(int num : bucket[freq]){
                answer[counter++] = num;
                if(counter == k) break;
                }

            }
        }
        System.out.println(map);
        
        return answer;
    }
}
