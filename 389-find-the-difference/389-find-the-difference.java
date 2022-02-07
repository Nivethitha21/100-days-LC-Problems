class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0)
            return t.charAt(0);
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            if(hs.containsKey(s.charAt(i)))
                hs.put(s.charAt(i),hs.get(s.charAt(i)) + 1);
            else
                hs.put(s.charAt(i),1);
            // hs.addOrDefault(s.charAt(i),hs.get(s.charAt(i)) + 1,1);
        }
        for(int i = 0; i < t.length(); i++)
        {
            if((!hs.containsKey(t.charAt(i))) || hs.containsKey(t.charAt(i)) && hs.get(t.charAt(i)) == 0)
                return t.charAt(i);
            if(hs.containsKey(t.charAt(i)))
                hs.put(t.charAt(i),hs.get(t.charAt(i))-1);
            
        }
        return 'a';
    }
}