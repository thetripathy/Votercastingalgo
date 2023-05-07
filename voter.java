import java.util.Scanner;
import java.util.InputMismatchException;

class votercard {
private int age;
public void setage(int age)throws IllegalArgumentException{
if(age<18 && age<=100)
throw new IllegalArgumentException("You Are Not Eligible For Voting");
if(age<0)
throw new IllegalArgumentException("Do Not Pass Negative Values");
this.age = age;
}
public int getage(){
return this.age;
}
}

class voter {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
votercard vc = new votercard();
System.out.print("Enter Your Name Please : ");
String name = scn.nextLine();
while(true){
try{
System.out.println(name+"Enter Your Age Please : ");
int age = scn.nextInt();
vc.setage(age);
System.out.println(name+"Your Age Is : "+vc.getage());
System.out.println(name+"\nCollect Your Voter Card From E-Seva After 15 Days");
break;
}catch(InputMismatchException e){
System.out.println("Enter Only Numbers");
scn.nextLine();
}catch(IllegalArgumentException e){
System.out.println(e.getMessage());
}
  }
    }
       }
