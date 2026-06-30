# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        
        result = []
        quwuw = collections.deque()
        quwuw.append(root)

        while quwuw:
            qLen = len(quwuw)
            level = []
            for i in range(qLen):
                node = quwuw.popleft()
                if node:
                    level.append(node.val)
                    quwuw.append(node.left)
                    quwuw.append(node.right)
            if level:
                result.append(level)

        return result