package jahvah;

public class Solution {
    public static void main(String []arg){
       
            int a = 0;
            int b = 2;
            int n = 10;
            int total = a + b;
            StringBuilder sb = new StringBuilder();
            sb.append(total).append(" ");
            for(int j = 0; j < n; j++){
                total += Math.pow(2, j) * b; 
                sb.append(total).append(" ");
            }
            System.out.println(sb.toString());

    }
}