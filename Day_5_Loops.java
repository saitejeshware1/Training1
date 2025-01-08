class Day_5_Loops {
    public static void main(String[] args) {
        String c = "Saitejeshwar";
        System.out.println(c.length());

        System.out.println(c.charAt(0));

        System.out.println(c.substring(6, 12));
        System.out.println(c.substring(7, 7));
        System.out.println(c.substring(0, 3));
        System.out.println("hello".equals("Hello"));
        System.out.println(c.substring(c.length() - 1));
        System.out.println(c.substring(c.length() - 3));
        System.out.println("hello" + 2 + 2);
    // loops
    for(int i = 0; i < 10;i++){
        System.out.println(c);
    }

    
        /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.


        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"*/
      

        public String stringTimes(String str, int n) {
            String result = "";
            for(int i=0;i<n;i++){
                result = result + str;
      
            }
         return result;
    
        }

      /*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") →  */
int countXX(String str) {
    int count = 0;
    for(int i=0; i< str.length()-1;i++){
      if(str.substring(i,i+2).equals("xx")) count++;
    }
    return count;
  



    }
}
