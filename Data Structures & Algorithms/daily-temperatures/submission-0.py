class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        
        n = len(temperatures)
        answer = [0]*n
        stack = []

        for i in range(n):
            # while stack 
            while stack and stack[-1][1] < temperatures[i]:
                stack_i, stack_temp = stack.pop()
                answer[stack_i] = i - stack_i
            stack.append((i, temperatures[i]))

        return answer
