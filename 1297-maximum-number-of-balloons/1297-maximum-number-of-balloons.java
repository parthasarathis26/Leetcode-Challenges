class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char c:text.toCharArray()){
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                hp.put(c,hp.getOrDefault(c,0)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        char[] req = {'b', 'a', 'l', 'o', 'n'};
        int[] freq = {1, 1, 2, 2, 1};

        for (int i = 0; i < req.length; i++) {
            char c = req[i];
            if (!hp.containsKey(c)) return 0; // missing letter
            int count = hp.get(c) / freq[i];
            min = Math.min(min, count);
        }

        return min;
    }
}