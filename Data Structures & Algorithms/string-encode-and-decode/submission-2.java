class Solution {

    public String encode(List<String> strs) {
        
        String str = "";
        for(String s : strs){
            
            str+= s+ "❤";
            System.out.println(str);
        }
        System.out.println(str);
        decode(str);
        return str;
    }

    public List<String> decode(String str) {
        ArrayList<String> decode = new ArrayList<String>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '❤'){
                decode.add(str.substring(0,i));
                str = str.substring(i+1);
                System.out.println("STR " + str);
                System.out.println("i - " + i);
                i=0;
            }

        }

    return decode;
    }
}
