class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char c:s.toCharArray()){
            hp.put(c,hp.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(hp.containsKey(c)){
                hp.put(c,hp.get(c)-1);
            }
        }
        for(int count:hp.values()){
            if(count>0){
                return false;
            }
        }
        return true;
    }
}