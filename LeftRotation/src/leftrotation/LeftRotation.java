/*Program done by Charith*/
package leftrotation;
import java.util.*;
import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            int j = (i+n-d)%n;
            arr[j] = scan.nextInt();
        }
        for(int j=0; j<n; j++) {
            System.out.print(arr[j] + " ");
        }      
    }   
}