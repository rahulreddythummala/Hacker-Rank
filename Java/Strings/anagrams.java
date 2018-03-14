// Complexity O(n)
// https://www.hackerrank.com/challenges/java-anagrams
static boolean isAnagram(String a, String b) {
    if(a.length()!=b.length()) return false;
    Map<Character, Integer> freq=new HashMap<>();        
    for(int i=0;i<a.length(); ++i){
        int f=0;
        Character ch=Character.toLowerCase(a.charAt(i));
        if(freq.get(ch)!=null)
           f=freq.get(ch);
        freq.put(ch,++f);
    }
    for(int i=0;i<b.length(); ++i){
        int g=0;
        Character ch=Character.toLowerCase(b.charAt(i));
        if(freq.get(ch)!=null)
           g=freq.get(ch);
        freq.put(ch,--g);            
    }
    for(Map.Entry e: freq.entrySet()){
        if(e.getValue()!=0)
            return false;
    }
    return true;
}
