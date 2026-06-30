class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ""

        for c in s:
        # only collect alnum characters
            if c.isalnum():
                # convert to lower
                newStr += c.lower()
        # if the string is the same in reverse then return true
        return newStr == newStr[::-1]

