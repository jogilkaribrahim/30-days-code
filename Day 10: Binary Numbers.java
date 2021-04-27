import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int count= 0;
        int maxcount = 0;
        while(n>0){
                int a = n%2;
             if(a ==1){
                     count ++;
                     if(count>maxcount){
                             maxcount=count;
                     }
             }else{
                     count=0;
             }
             
                        n = n/2;   
        }
        System.out.println(maxcount);

        scanner.close();
    }
}
