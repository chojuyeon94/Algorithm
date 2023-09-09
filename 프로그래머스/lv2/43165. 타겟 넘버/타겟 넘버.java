class Solution {
    public int solution(int[] numbers, int target) {
        
        return recursiveFunction(numbers, target, 0, 0);
    }
    
    public static int recursiveFunction(int[] numbers, int target, int index, int sum){
        
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        // 현재 숫자를 더하거나 빼서 다음 재귀 호출을 수행
        int add = recursiveFunction(numbers, target, index + 1, sum + numbers[index]);
        int subtract = recursiveFunction(numbers, target, index + 1, sum - numbers[index]);

        // 더하기와 빼기 경우의 수를 합쳐서 반환
        return add + subtract;
        
    }
    
}