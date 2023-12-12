object SalaryEmployee{
def main(args: Array[String]):Unit={
var e = new Employee()
e.getEmployee();
e.showGrade();
e.showEmployee();
}
}
class Employee{
var empid:Int=0;
var empname:String=null;
var designation:String=null;
var salary:Int=0;
var grade:Char='-';
def getEmployee(){
print("Enter Emp ID: ");
this.empid = scala.io.StdIn.readInt();
print("Enter Emp Name: ");
this.empname = scala.io.StdIn.readLine();;
print("Enter Designation: ");
this.designation= scala.io.StdIn.readLine();
print("Enter Salary: ");
this.salary = scala.io.StdIn.readInt();
}
def showGrade(){
if(this.salary<10000){
this.grade='D';
println("Employee Grade: "+this.grade);
}
else if(this.salary>=10000 && this.salary<25000){
this.grade='C';
println("Employee Grade: "+this.grade);
}
else if(this.salary>=25000 && this.salary<50000){
this.grade='B';
println("Employee Grade: "+this.grade);
}
else{
this.grade='A';
println("Employee Grade: "+this.grade);
}
}
def showEmployee(){
print(this.empid 
,this.empname,this.designation,this.salary,this.grade)
}
}