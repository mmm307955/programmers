import java.util.*;
public class Solution{
    public List solution(int l, int r) {
            List<Integer> arr = new ArrayList<>();

            for(int i = l; i <= r; i++) {
                boolean ok = true;
                String input = String.valueOf(i);
                char[] ch = input.toCharArray();

                for(int j = 0; j < input.length(); j++){
                    if(ch[j] != '0' && ch[j] != '5') {
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    arr.add(i);
                }
            }
            if(arr.isEmpty()){
                arr.add(-1);
            }
            return arr;
        }
}