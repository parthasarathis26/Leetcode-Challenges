class Solution {
public:
    int countPoints(string rings) {
        unordered_map<int,set<char>> rod;
        for(auto i=0;i<rings.size();i+=2){
            char color=rings[i];
            int r=rings[i+1]-'0';
            rod[r].insert(color);
        }
        int c=0;
        for(auto pair : rod){
            if(pair.second.size()==3){
                c++;
            }
        }
        return c;
    }
};