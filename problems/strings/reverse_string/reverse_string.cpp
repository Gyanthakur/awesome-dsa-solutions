#include <bits/stdc++.h>
using namespace std;

string reverseString(string s) {
    reverse(s.begin(), s.end());
    return s;
}

int main(){
    cout << reverseString("hello"); // olleh
}
