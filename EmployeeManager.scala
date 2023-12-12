object EmployeeManager{
def main(args: Array[String]){
var e = new Employee();
e.getMember();
e.printSalary();
e.showMember();
var m = new Manager();
m.getMember();
m.printSalary();
m.showMember();
}
}
class Member{
var name:String = null;
var age:Int=0;
var phoneno:String=null;
var address:String=null;
var salary:Int=0;
def getMember():Unit={
print("Name: ")
this.name = scala.io.StdIn.readLine();
print("Age: ")
this.age = scala.io.StdIn.readInt();
print("Phone no: ")
this.phoneno = scala.io.StdIn.readLine();
print("Address: ")
this.address = scala.io.StdIn.readLine();
print("Salary: ")
this.salary = scala.io.StdIn.readInt();
}
def showMember(){
println("Name: "+this.name)
println("Age: "+this.age)
println("Phone no: "+this.phoneno)
println("Address: "+this.address)
println("Salary: "+this.salary)
}
def printSalary():Unit={
println(this.salary)
}
}
class Employee extends Member{
var specialization:String=null;
override def getMember(){
super.getMember
print("Specialization: ")
this.specialization = scala.io.StdIn.readLine();
}
override def showMember(){
super.showMember
print("Specialization: "+this.specialization)
}
}
class Manager extends Member{
var department:String=null;
override def getMember(){
super.getMember
print("Department: ")
this.department = scala.io.StdIn.readLine();
}
override def showMember(){
super.showMember
print("Department: "+this.department)
}
}
