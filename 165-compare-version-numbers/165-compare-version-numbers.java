class Solution {
    public int compareVersion(String version1, String version2) {
       // Split both the Strings 
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length,l2 = v2.length;
        int ind1=0,ind2 =0,result =0,val = (l1<=l2?l1:l2);
        for(int i=0;i<val;i++){
            // Point ind1 and ind2 where non '0' character start
            ind1 =0;
            while(ind1!=v1[i].length() && v1[i].charAt(ind1)=='0'){
                ind1++;
            }
            ind2 =0;
            while(ind2!=v2[i].length() && v2[i].charAt(ind2)=='0'){
                ind2++;
            }
            if(ind1==v1[i].length() && ind2 ==v2[i].length()) continue;       // Both are string of '0's
            else if(ind1!=v1[i].length() && ind2 ==v2[i].length()) return 1;  // one of them 
            else if(ind1==v1[i].length() && ind2 !=v2[i].length()) return -1; // are non-zero
			// Compare both values by converting them to Integer
            if(Integer.valueOf(v1[i].substring(ind1))<Integer.valueOf(v2[i].substring(ind2))){
                return -1;
            }else if(Integer.valueOf(v1[i].substring(ind1))>Integer.valueOf(v2[i].substring(ind2))){
                return 1;
            }
            result = v1[i].substring(ind1).compareTo(v2[i].substring(ind2));                                 
        }
		// If string arrays are of unequal size
        if(l1>l2){
            for(int i=val;i<l1;i++){
                for(int j=0;j<v1[i].length();j++)
                    if(v1[i].charAt(j)!='0') return 1;
            }
        }else if(l2>l1){
            for(int i=val;i<l2;i++){
                for(int j=0;j<v2[i].length();j++)
                    if(v2[i].charAt(j)!='0') return -1;
            }
        }
        
        return result;
    }
}