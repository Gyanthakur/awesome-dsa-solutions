#include <bits/stdc++.h>
using namespace std;

void reverseArray(vector<int> &arr) {
    int left = 0, right = arr.size() - 1;
    while (left < right) {
        swap(arr[left], arr[right]);
        left++;
        right--;
    }
}

int main() {
    vector<vector<int>> tests = {
        {1, 2, 3, 4, 5},
        {10, 20, 30},
        {},
        {7}
    };

    for (auto arr : tests) {
        cout << "Original: [";
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) cout << ", ";
            cout << arr[i];
        }
        cout << "] -> Reversed: [";
        reverseArray(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) cout << ", ";
            cout << arr[i];
        }
        cout << "]\n";
    }
    return 0;
}
