// largest_element.cpp
#include <iostream>
#include <vector>
#include <stdexcept>
using namespace std;

int largestElement(const vector<int>& arr) {
    if (arr.empty()) {
        throw invalid_argument("Array is empty.");
    }

    int maxElement = arr[0];
    for (size_t i = 1; i < arr.size(); i++) {
        if (arr[i] > maxElement) {
            maxElement = arr[i];
        }
    }
    return maxElement;
}

int main() {
    cout << "Running test cases for C++ solution...\n\n";

    // Test 1
    vector<int> arr1 = {3, 5, 7, 2, 8};
    cout << "Input: [3, 5, 7, 2, 8]\n";
    cout << "Largest Element: " << largestElement(arr1) << "\n\n";

    // Test 2
    vector<int> arr2 = {-5, -2, -10};
    cout << "Input: [-5, -2, -10]\n";
    cout << "Largest Element: " << largestElement(arr2) << "\n\n";

    // Test 3
    vector<int> arr3 = {1, 1, 1};
    cout << "Input: [1, 1, 1]\n";
    cout << "Largest Element: " << largestElement(arr3) << "\n";

    return 0;
}
