import java.io.*;
import java.util.*;
public class StudentManagementSystem{
static HashMap<INteger,String>StudentMap=new HashMap<>();
static final String FILE_NAME="students.txt";
public stautic void main(String[] args){
Scanner sc=new Scsnner(SYstem.in);
int choicccccce;
do{
System.out..println("/n-Student MAnagement Menu-");
System.out.println("1. add student");
System.out.println("2. save to file");
System.out.println("3. Load from File");
System.out.println("4. Search by 1D");
System.out.println("5. Remove Student");
System.out.println("6. Display All Students");
System.out.println("0. Exit");
System.out.println("Enter choice:");
choice=sc.nextInt();
Switch(choice){
case1->addStudent(sc);
case2->save to file();
case3->load from File();
case4->
case->removeStudent(sc);
case6->displayAll();
case0->System.out.println("Existing program:");
defualt->System.out.println("Invalid choice.Try again:");
}
}
while(choice!=0);
sc.close();
}
static void addStudent(Scanner sc){
System.out.print("Enter Student ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Student name:");
String=sc.nextLine();
if(StudentMap.contains key(id));
System.out.println("ID already exists){
}else{
StudentMap.put(id,name);
System.out.println("Student added:");
}
}
Try(BufferedC