import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")){
                map.put(name, status);
            }else{
                map.remove(name);
            }
        }
        List<String> names = new ArrayList<>(map.keySet());
        Collections.sort(names, Collections.reverseOrder());
        
        for(String name : names){
            System.out.println(name);
        }
    }
}