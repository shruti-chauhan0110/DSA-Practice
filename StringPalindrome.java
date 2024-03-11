public class StringPalindrome {

    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
          int  n=s.length();
          if(s.charAt(i)!=s.charAt(n-1-i)){
            return false;
          }
        }
        return true;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        String sc="racecar";
        System.out.println(isPalindrome(sc));;
    }
    
}
