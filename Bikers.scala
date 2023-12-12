object Bikers{
def main(args: Array[String]):Unit={
var r1:Int=0;
var r2:Int=0;
var r3:Int=0;
var r4:Int=0;
var r5:Int=0;
print("Enter speed of racer 1: ");
r1=scala.io.StdIn.readInt();
print("Enter speed of racer 2: ");
r2=scala.io.StdIn.readInt();
print("Enter speed of racer 3: ");
r3=scala.io.StdIn.readInt();
print("Enter speed of racer 4: ");
r4=scala.io.StdIn.readInt();
print("Enter speed of racer 5: ");
r5=scala.io.StdIn.readInt();
var avg:Double = (r1+r2+r3+r4+r5)/5;
print(avg)
if(r1>avg){
print("Racer 1 qualifies with speed "+r1)
}
if(r2>avg){
print("Racer 2 qualifies with speed "+r2)
}
if(r3>avg){
print("Racer 3 qualifies with speed "+r3)
}
if(r4>avg){
print("Racer 4 qualifies with speed "+r4)
}
if(r5>avg){
print("Racer 5 qualifies with speed "+r5)
} 
}
}