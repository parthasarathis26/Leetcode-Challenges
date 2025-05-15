
class Encrypter {
    unordered_map<char, string> m; // mapping from character keys to corresponding value strings
    unordered_map<string, int> freq; // frequency map of encrypted permitted original strings
public:
    Encrypter(vector<char>& keys, vector<string>& values, vector<string>& dictionary) {
        for (int i = 0; i < keys.size(); ++i) {
            m[keys[i]] = values[i];
        }
        for (auto &s : dictionary) {
            auto e = encrypt(s);
            if (e.size()) freq[e]++;
        }
    }
    string encrypt(string s) {
        string ans;
        for (char c : s) {
            if (m.count(c) == 0) return ""; // invalid key character met, return empty string.
            ans += m[c];
        }
        return ans;
    }
    int decrypt(string s) {
        return freq.count(s) ? freq[s] : 0;
    }
};