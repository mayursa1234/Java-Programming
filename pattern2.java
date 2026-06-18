//PRINT HALLOW RECTANGLE WITH THE HELP OF STAR PATTERN

// public class pattern2 {
//     public static void Hallow_rectangle(int totrows , int totColumns){
//         for(int i=1; i<=totrows; i++){
//             for(int j=1; j<=totColumns; j++){
//                 if (i==1 || i==totrows || j==1 || j==totColumns) {
//                     System.out.print("*");                   
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Hallow_rectangle(10,5);
//     }
// }

//INVERTED AND ROTATED HALF PYRAMID

// public class pattern2 {
//     public static void Half_Pyramid(int n){
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }        
//     }

//     public static void main(String[] args) {
//         Half_Pyramid(5);
//     }
// }

//INVERTED HALF NUMBER PYRAMID

// public class pattern2 {
//     public static void NumberHalf_Pyramid(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         NumberHalf_Pyramid(6);
//     }
// }

//FLOYED TRIANGLE PATTERN

// public class pattern2 {
//     public static void Floyed_Triangle(int n){
//         int counter=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(counter+ " ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Floyed_Triangle(7);
//     }
// }

//0-1 TRIANGLE PATTERN

// public class pattern2 {
//     public static void zero_oneTriangle(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if ((i + j) % 2 ==0) {
//                     System.out.print("1" + " ");
//                 }else{
//                     System.out.print("0" + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         zero_oneTriangle(5);
//     }
// }

//BUTTERFLY PATTERN 

// public class pattern2 {
//     public static void Butterfly(int n){
//         //UPPER PART
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<= 2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//            //LOWER PART
//         for(int i=n; i>=1; i--){
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<= 2 * (n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Butterfly(15);
//     }
// }

//RHOMBUS PATTERN

public class pattern2 {
    public static void Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
        
        for (int j = 1; j <= n; j++) {
            System.out.print("*");
        }
        System.out.println();
     }
  }

    public static void main(String[] args) {
        Rhombus(8);
    }
}