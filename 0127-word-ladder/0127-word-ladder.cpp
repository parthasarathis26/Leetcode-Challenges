class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        set<string> s;
        int flag=1;
        for(auto word:wordList){
            if(word.compare(endWord)==0){
                flag=0;
            }
            s.insert(word);
        }
        if(flag==1) return 0;
        queue<string> q;
        q.push(beginWord);
        int level=0;
        int lsize;
        while(!q.empty()){
            level++;
            lsize=q.size();
            while(lsize--){
                string cur=q.front();
                q.pop();
                for(int i=0;i<cur.size();i++){
                    string temp=cur;
                    for(char ch='a';ch<='z';ch++){
                        temp[i]=ch;
                        if(temp.compare(cur)==0){
                            continue;
                        }
                        if(temp.compare(endWord)==0){
                            return level+1;
                        }
                        if(s.contains(temp)){
                            q.push(temp);
                        }
                        s.erase(temp);
                    }
                }
            }
        }
        return 0;
    }
};