#include <bits/stdc++.h>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int,int> seen;
    for(int i=0;i<nums.size();i++){
        int complement = target - nums[i];
        if(seen.count(complement)) return {seen[complement], i};
        seen[nums[i]] = i;
    }
    return {};
}

int main(){
    vector<int> nums = {2,7,11,15};
    int target = 9;
    vector<int> ans = twoSum(nums, target);
    cout << "[" << ans[0] << "," << ans[1] << "]";
}
