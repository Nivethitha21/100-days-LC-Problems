class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {      
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i = 0; i < magazine.length(); i++)
        {
            if(mp.containsKey(magazine.charAt(i)))
                mp.replace(magazine.charAt(i),mp.get(magazine.charAt(i))+1);
            else
                mp.put(magazine.charAt(i),1);
        }
        for(int i = 0; i < ransomNote.length();i++)
        {
            if(mp.containsKey(ransomNote.charAt(i)) && mp.get(ransomNote.charAt(i)) != 0)
                mp.replace(ransomNote.charAt(i),mp.get(ransomNote.charAt(i))-1);
            else
                return false;
        }
        return true;
    }
}