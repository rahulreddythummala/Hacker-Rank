// Data is not sorted, so we need to keep track of last column of train track so far
// Hence mapping each row to last train track
// Once a value is read, check if there is a track(value exists in map)
// If there is a value check last col value
//      if last col is less than current col, then update cols and last col in map
//      else if last col is less than last col or current track get the difference
//      else ignore
// else count cols and put the values into map

// Now r*c - cols is the vacant positions

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long r=sc.nextLong();
        long c=sc.nextLong();
        int n=sc.nextInt();
        long loc=r*c;
        long cols=0;
        long r_ptr=-1;
        long c_ptr=-1;
        HashMap<Long, Long> tracks=new HashMap<>();
        for(int i=0;i<n;++i){
            Long tr=sc.nextLong();
            Long tc1=sc.nextLong();
            Long tc2=sc.nextLong();
            if(tracks.get(tr)==null){
                cols+=tc2-tc1+1;
                tracks.put(tr,tc2);
            }else{
               c_ptr=tracks.get(tr);
               if(tc1>c_ptr){          // If the next track is neighbour or ahead
                   cols+=tc2-tc1+1;
                   tracks.put(tr,tc2);      // Update the last col read for that row
                }else if(tc1<=c_ptr && tc2>c_ptr){             // If the next tract is overlapping
                   cols+=tc2-c_ptr;
                   tracks.put(tr,tc2);      // Update the last col read for that row
                }                       // If it's a subset just ignore
            }
        }
        System.out.println(loc-cols);
    }
}
