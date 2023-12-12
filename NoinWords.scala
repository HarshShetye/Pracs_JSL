object NoinWords{
def main(args: Array[String]):Unit={
var n = scala.io.StdIn.readInt();
val og =n;
var s:String=""
while(n>0){
var temp = n%10;
n= n/10;
temp match{
case 1=> s="One "+s
case 2=> s="Two "+s
case 3=> s="Three "+s
case 4=> s="Four "+s
case 5=> s="Five "+s
case 6=> s="Six "+s
case 7=> s="Seven "+s
case 8=> s="Eight "+s
case 9=> s="Nine "+s
case 0=> s="Zero "+s
case _=> s="Non-digit "+s
}
}
print(s)
}
}