
// public class string {
//     public static void main(String[] args) {
//         // String str="Mayur vijay sawarbandhe nighavi asgaon pauni bhandara maharastra";
//         // String str1=new String("XYZ");
//         // System.out.println("The first string also write the name as "+  str +" The second string data will be "+ str1);



//         Scanner sc = new Scanner(System.in);
//         String name;
//         name = sc.nextLine();
//         System.out.println("My name is the :" + name);
//         System.out.println(name.length());

//     }
// }



//PALINDROME OR NOT


public class string {
    public static boolean isPalindrom(String str){
        int n=str.length();
        for(int i=0; i< n/2; i++){
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        // String str="Racecar";  //false
        // String str="RacecaR";    //true
        String str="Mayur";       //false
        System.out.println(isPalindrom(str));
    }
}