def longestCommonPrefix(strs) -> str:

    #Input: ["flower","flow","flight"]
    #Output: "fl"

    # flower       flow        flight
    #  0  i         j  i        j  i
    # [0][0] - f = [1][0] - f, [2][0] - f
    # [0][1] - l = [1][1] - l, [2][1] - l
    # [0][2] - o = [1][2] - o, [2][2] - o
    # [0][3] - w = [1][3] - w, [2][3] - w
    
    res = ''
    # Iterate over shortest string in the list
    for i in range(len(min(strs, key=len))):
        if all(strs[0][i] == strs[j][i] for j in range(1,len(strs))):
            res = res + strs[0][i]
        else:
            return res
    return res
print(longestCommonPrefix(["flower","flow","flight"]))