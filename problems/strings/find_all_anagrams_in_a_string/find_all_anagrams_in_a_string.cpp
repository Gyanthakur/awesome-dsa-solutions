#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>
using namespace std;

vector<int> findAnagrams(string s, string t) {
    // Create a HashMap for target
    unordered_map<char, int> t_ctr;
    for (char c : t) t_ctr[c]++;

    vector<int> res;
    int lent = t.size();
    unordered_map<char, int> s_ctr;

    for (int i = 0; i < s.size(); i++) {
        // Add current char to window
        s_ctr[s[i]]++;

        // Remove char that goes out of window
        if (i >= lent) {
            s_ctr[s[i - lent]]--;
            if (s_ctr[s[i - lent]] == 0)
                s_ctr.erase(s[i - lent]);
        }

        // Compare both frequency maps
        if (s_ctr == t_ctr)
            res.push_back(i + 1 - lent);
    }

    return res;
}

int main() {
    string source = "cbaebabacd";
    string target = "abc";
    vector<int> ans = findAnagrams(source, target);
    for (int idx : ans) cout << idx << " ";
    cout << endl;
    
    source = "abab";
    target = "ab";
    ans = findAnagrams(source, target);
    for (int idx : ans) cout << idx << " ";
    return 0;
}
