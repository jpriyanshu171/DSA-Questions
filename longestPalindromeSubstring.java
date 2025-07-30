package String;

public class longestPalindromeSubstring {
        public String longestPalindrome(String s){
                if(s==null||s.length()<1){
                        return "";
                }
                int maxLength=0;
                int start=0;

                for(int i=0;i<s.length();i++){
                        int len1=expandFromCenter(s,i,i);
                        int len2=expandFromCenter(s,i,i+1);
                        int len=Math.max(len1,len2);
                        if(len>maxLength){
                                maxLength=len;
                                start=i-(len-1)/2;
                        }
                }
                return s.substring(start,start+maxLength);
        }
        public int expandFromCenter(String s,int left, int right){
                while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                        left--;
                        right++;
                }
                return right-left-1;
        }

        public static void main(String[] args) {
                longestPalindromeSubstring obj=new longestPalindromeSubstring();
                String s="babad";
                String result=obj.longestPalindrome(s);
                System.out.println("Longest Palindrome Substring= "+result);
        }
}
