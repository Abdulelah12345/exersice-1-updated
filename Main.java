import java.util.Scanner;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //. Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.

        float weight , height ;
        double BMI;
        System.out.println("Enter Your Weight (kg): ");
        weight= sc.nextFloat();
        System.out.println("Enter Your Height (m): ");
        height= sc.nextFloat();
        double x=Math.pow(height,2);
        BMI=weight/x;
        System.out.println("BMI= "+BMI);




        //2. Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        float marks;
        int totalM;
        double Percentag;
        float devide;

        System.out.println("Enter the Obtained marks: ");
        marks=sc.nextInt();
        System.out.println("Enter the totalM: ");
        totalM=sc.nextInt();
        devide=marks/totalM;
        Percentag=devide*totalM;
        System.out.println("Percentage: "+Percentag+"%");


        // 3-Create a program that takes an amount in one currency and an exchange rate
//as input, then converts and prints the amount in another currency.
        int USD;
        double exchangeRate;
        double EUR;
        System.out.println("Enter the amount of money you have (USD)");
        USD=sc.nextInt();
        System.out.println("Enter the Exchange Rate: ");
        exchangeRate= sc.nextDouble();
        EUR=USD*exchangeRate;
        System.out.println("The money you have in (EUR) is: "+EUR);





        //4. Create a program that takes a string as input, calculates its length, and then
//reverses the string using the StringBuilder class, finally printing both the length and
//reversed string.
        System.out.println("Enter a word ");
        StringBuilder hello=new StringBuilder(sc.nextLine());;

        StringBuilder revers=hello.reverse();
        System.out.println("The length of the word is: "+hello.length()+" And Reversed string is: "+revers);


        // 5. Develop a program that takes a sentence as input and extracts a substring from
//it, then prints the extracted substring.
        String Sentence;
        int nnum1,nnum2;
        System.out.println("Enter a Sentence");
        Sentence=sc.nextLine();
        System.out.println("Enter Start Index ");
        nnum1=sc.nextInt();
        System.out.println("Enter End Index ");
        nnum2=sc.nextInt();


        String sub =Sentence.substring(nnum1,nnum2);
        System.out.println(sub);


       // 6. Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.

     String sentens,keyw;
        System.out.println("Enter a sentenc: ");
        sentens=sc.nextLine();
        System.out.println("Enter your keyword: ");
        keyw=sc.nextLine();

        boolean ex=sentens.contains(keyw);
        System.out.println(ex);


       // 7. Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.
        String s1,s2,s3;
        System.out.println("Enter a sentence: ");
        s1=sc.nextLine();
        s1=sc.nextLine();
        System.out.println("Word to Replace ");
        s2=sc.nextLine();
        System.out.println("Replacement Word ");
        s3=sc.nextLine();
        s1=s1.replace(s2,s3);
        System.out.println("new sentence is: "+s1);





       // 8. Write a program that takes two strings as input and check if they are equal,
         //       ignoring the case, then prints whether they are equal or not.

        String ss1,ss2;
        System.out.println("Enter your first word 1 ");
        ss1=sc.nextLine();
        System.out.println("Enter your first word 2 ");
        ss2=sc.nextLine();
        System.out.println(ss1.equalsIgnoreCase(ss2));






    }
}