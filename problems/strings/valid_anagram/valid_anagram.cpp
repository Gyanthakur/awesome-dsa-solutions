#include <bits/stdc++.h>
using namespace std;

bool isAnagram(string s, string t) {
    // Check length of source string vs target string. And check unique characters of source string vs target string.
    unordered_set<char> unique_chars_s(s.begin(), s.end());
    if (s.length() != t.length() && unique_chars_s != unordered_set<char>(t.begin(), t.end())) {
        return false;
    }

    // Check the count of each unique character in the source string against the count of the same character in the target string.
    for (char c : unique_chars_s) {
        if (count(s.begin(), s.end(), c) != count(t.begin(), t.end(), c)) {
            return false;
        }
    }
    return true;
}

int main() {
    string source = "aabc";
    string target = "baca";
    cout << boolalpha << isAnagram(source, target);
    return 0;
}