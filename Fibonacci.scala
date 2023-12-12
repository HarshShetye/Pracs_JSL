object Fibonacci{
def main(args: Array[String]){
print("Enter number: ")
var n:Int=scala.io.StdIn.readInt();
var t1:Int=0;
var t2:Int=1;
var fib:Int=fibonacci(t1,t2,n-2);
print(fib)
}
def fibonacci(t1:Int,t2:Int,n:Int):Int={
if(n==0){
return t2
}
fibonacci(t2,t1+t2,n-1);
}
}