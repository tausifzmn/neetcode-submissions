class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        # maxHeap works but its k log n

        # bucket sort is linear O(n)
        # the buckets are going to sorted according to the number of elements in the list
        # instead of sorted amongst the range of elements themselves

        # hashmap to count the occurances 
        count = {}
        # array calle freq with index as count of element with 
        # holding lists of elements that occur that many times
        freq = [[] for i in range(len(nums)+1)]

        # number of times each value in nums occurs
        for n in nums:
            count[n] = 1 + count.get(n, 0)

        # going thru what we counted
        for n, c in count.items():
            freq[c].append(n)

        # result k elements
        res = []

        # reverse the freq array
        for i in range (len(freq) -1, 0, -1):

            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res