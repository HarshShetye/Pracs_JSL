object prime{
def main(args: Array[String]):Unit={
val n = scala.io.StdIn.readInt();
var i=2;
var flag=0;
do{
if(n%i==0){
flag=1;
}
}while(i<=n);
}
}
