#include <bits/stdc++.h>
using namespace std;

bool isAlnum(char c) {
    return isalnum(static_cast<unsigned char>(c));
}

bool isPalindrome(const string &s) {
    int left = 0, right = (int)s.size() - 1;
    while (left < right) {
        while (left < right && !isAlnum(s[left])) left++;
        while (left < right && !isAlnum(s[right])) right--;
        if (left < right) {
            char a = tolower(static_cast<unsigned char>(s[left]));
            char b = tolower(static_cast<unsigned char>(s[right]));
            if (a != b) return false;
            left++; right--;
        }
    }
    return true;
}

int main() {
    vector<pair<string,bool>> tests = {
        {"A man, a plan, a canal: Panama", true},
        {"race a car", false},
        {"", true},
        {"0P", false},
        {"Able was I, ere I saw Elba", true}
    };

    for (auto &t : tests) {
        cout << "\"" << t.first << "\" -> " << (isPalindrome(t.first) ? "true" : "false")
             << " (expected: " << (t.second ? "true" : "false") << ")\n";
    }
    return 0;
}
