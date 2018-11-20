import java.util.*;

public class HundredDoors {
   public static void main(String[] args) {
      boolean[] arr = new boolean[100];
      run(arr);
      System.out.println(Arrays.toString(arr));
   }
   
   public static void run(boolean[] arr) {
      for (int pass = 1; pass <= 100; pass++) {
         for (int door = 0; door < arr.length; door++) {
            if ( door % pass == 0) {
               arr[door] = !arr[door];
            }
         }
      }
   }
}