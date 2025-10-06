#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

string longestCommonPrefix(vector<string>& strs) {

    // Input: ["flower","flow","flight"]
    // Output: "fl"

    // flower       flow        flight
    //  0  i         j  i        j  i
    // [0][0] - f = [1][0] - f, [2][0] - f
    // [0][1] - l = [1][1] - l, [2][1] - l
    // [0][2] - o = [1][2] - o, [2][2] - o
    // [0][3] - w = [1][3] - w, [2][3] - w

    string res = "";

    // Find the minimum length string
    int minLen = strs[0].size();
    for (int k = 1; k < strs.size(); k++) {
        minLen = min(minLen, (int)strs[k].size());
    }

    for (int i = 0; i < minLen; i++) {
        bool allSame = true;
        for (int j = 1; j < strs.size(); j++) {
            if (strs[0][i] != strs[j][i]) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            res += strs[0][i];
        else
            return res;
    }

    return res;
}

int main() {
    vector<string> strs = {"flower", "flow", "flight"};
    cout << longestCommonPrefix(strs);
    return 0;
}