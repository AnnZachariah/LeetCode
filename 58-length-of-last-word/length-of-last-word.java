class Solution {
    public int lengthOfLastWord(String s) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        int c = 0;
        for(int i =0;i<s.length();i++){
            s = s.trim();
        }

        for(int i = s.length()-1;i>=0;i--){
            n = n+s.charAt(i);
        }

        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == ' '){
                break;
            }
            c++;
        }
        return c;
    }
}