package evaltuaion2;
import java.util.Scanner;
public class StringManipulator {

    public String removeVowels(String str) {
          if(str!=null){
              String str1 ="";
              int n= str.length();
              for(int i=0;i<n-1; i++) {
                  if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt('u') == 'a'))
                  {
                      str1 = str1 + "";
                  } else {
                      str1 += str1.charAt(i);
                  }
              }
                  return  str1;
              }
              else{
                  return null;
              }

          }



    public static void main(String[] args) {
        StringManipulator obj1=new StringManipulator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String  str = sc.next();

        String result =obj1.removeVowels(str);
//        obj1.removeVowels(str);
        System.out.println(result);



    }

    }

