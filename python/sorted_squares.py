class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        result = []
        for idx, n in enumerate(A):
            positive_number =  n * -1
            square = positive_number * positive_number
            result.append(square)
        return sorted(result)   
