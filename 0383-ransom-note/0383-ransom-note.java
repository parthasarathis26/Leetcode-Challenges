class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            if(!hp.containsKey(c)){
                hp.put(c,1);
            }
            else{
                hp.put(c,hp.get(c)+1);
            }
        }
        for(char c:magazine.toCharArray()){
            if(hp.containsKey(c)){
                hp.put(c,hp.get(c)-1);
            }
        }
        for(char c:ransomNote.toCharArray()){
            if(hp.get(c)>0) return false;
        }
        return true;
    }
}