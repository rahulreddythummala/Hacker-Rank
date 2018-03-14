// The idea is to two maps(one of note, other for news) each will have a count for a word
// Pick each word from the note map and check if there is a word in the news map
//    If so then that words's frequency should be at least greater than note map's freq
//    else return false
// Else there is no word then return false

import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap=new HashMap<>();
        noteMap=new HashMap<>();
        for(String s: magazine.split(" ")){
            if(magazineMap.get(s)==null){
                magazineMap.put(s,1);
            }
            else{
                magazineMap.put(s,1+magazineMap.get(s));
            }
        }
        for(String s: note.split(" ")){
            if(noteMap.get(s)==null){
                noteMap.put(s,1);
            }
            else{
                noteMap.put(s,1+noteMap.get(s));
            }
        }
    }
    
    public boolean solve() {
        if(noteMap.size()>magazineMap.size())
            return false;
        for(Map.Entry e : noteMap.entrySet()){
            if(magazineMap.get(e.getKey())<((Integer)e.getValue())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

