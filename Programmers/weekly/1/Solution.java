class Solution {
    public long solution(int price, int money, int count) {

        long sum = (count * (count + 1)) / 2;
        
        answer = money - (price * sum);
        
        if(answer < 0) {
            return -1 * answer;
        }

        return 0;
    }
}
