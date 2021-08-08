public class LinkString {



    static class Solution {

        public char firstUniqChar(String s) {
            int[] visit=new int[26];
            int[] visit_tmp=new int[26];
            int tmp=0;
            if(s.equals(""))return ' ';
            for(int i=0;i<s.length();++i){
                int x=s.charAt(i)-'a';
//            System.out.println(x);
                if(visit[x]<=0)
                    visit_tmp[tmp++]=x;
                ++visit[x];
            }
            for(int i=0;i<26;++i){
                if(visit[visit_tmp[i]]==1) return (char)('a'+visit_tmp[i]);
            }
            return ' ';
        }
    }

}
