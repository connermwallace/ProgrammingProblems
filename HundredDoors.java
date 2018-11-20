/*
There are 100 doors in a row that are all initially closed.

You make 100 passes by the doors.

The first time through, visit every door and  toggle  the door  (if the door is closed,  open it;   if it is open,  close it).

The second time, only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.

The third time, visit every 3rd door   (door #3, #6, #9, ...), etc,   until you only visit the 100th door.
*/

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