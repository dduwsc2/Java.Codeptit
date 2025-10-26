import java.util.*;
public class J03004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] word = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String i:word){
                sb.append(i.substring(0,1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
