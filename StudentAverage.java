import java.io.*;
import java.util.Scanner;
    public class StudentAverage
    {
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter marks of  five subjects");
	        int s1=sc.nextInt();
	        int s2=sc.nextInt();
	        int s3=sc.nextInt();
	        int s4=sc.nextInt();
	        int s5=sc.nextInt();
	        float avg=(float)(s1+s2+s3+s4+s5)/5;
	        System.out.println("Average of a student is "+avg);
	        if(avg>=80){
	            System.out.println("Student passed with distinction");
	        }
	        else if(avg>=70&&avg<80){
	            System.out.println("Student passed with first class");
	        }
	        else if(avg>=50&&avg<70){
	            System.out.println("Student passed with second class");
	        }
	        else if(avg>=40&&avg<50){
	            System.out.println("Student passed with third class");
	        }
	        else{
	            System.out.println("Student failed");
	        }
	    }
    }
