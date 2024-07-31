class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String numStr = String.valueOf(n);
	    char[] array = numStr.toCharArray();
        answer= new int[array.length];
        long num = n;
        int i=0;
        while(num>0){
            long elment = num %10L;
            answer[i] = (int)elment;
            num = num/10;
            i++;
        }
        return answer;
    }
}