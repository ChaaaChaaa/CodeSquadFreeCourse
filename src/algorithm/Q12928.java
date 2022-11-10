package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q12928 {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }

        int ans = 0;

        for (Integer number : list) {
            ans += number;
        }

        return ans;
    }

//    def solution(n):
//    ans=0
//            for i in range(1,n+1):
//            if n%i == 0:
//              ans+=i
//    return ans


    public static void main(String[] args) {
        Q12928 q12928 = new Q12928();
        System.out.println(q12928.solution(12));
    }
}
