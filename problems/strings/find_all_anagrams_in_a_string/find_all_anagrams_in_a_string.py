from collections import Counter
def findAnagrams(s: str, t: str) -> list:
        # Create a HashMap for target
        t_ctr = Counter(t)
        res = []

        lent = len(t)
        s_ctr = {}

        for i in range(len(s)):
            s_ctr[s[i]] = s_ctr.get(s[i],0) + 1
            if i >= lent:
                s_ctr[s[i-lent]] = s_ctr[s[i-lent]] - 1

                if s_ctr[s[i-lent]] == 0:
                    del s_ctr[s[i-lent]]

            if t_ctr == s_ctr:
                res.append(i+1-lent)

        return res

source = 'cbaebabacd'
target = 'abc'
print(findAnagrams(source, target))

source = 'abab'
target = 'ab'
print(findAnagrams(source, target))