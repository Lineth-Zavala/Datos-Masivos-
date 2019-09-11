//Fibonacci1
def fib1( n : Int) : Int = { 
  def fib_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a 
    case _ => fib_tail( n-1, b, a+b )
  }
  return fib_tail( n, 0, 1)
}

//Fibonacci2
def fib2(n:Int): Int = }
    def calFib( n: Int, pre : Int, cur: Int): Int={
      if (n==0)
        pre
      else
        calFib(n-1, cur,cur+pre)
    }
  calFin(n, 0, 1)
  }
  for( i <- 1 to 10)
  println(fib(i))
  }


  def fib(n: Int, first: Int = 0, second: Int = 1 ): Int = {
      if(n == 1)
         return first
      else
         return first + fib(n -1, second, first + second)
  }
  println(fib(1000))   
}

//Fibonacci3
def fib3( n : Int ) : Int = {
  var a = 0
  var b = 1
  var i = 0	  
 
  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  } 
  return a
}

//Fibonacci4
def fib_re(num: Int): Int = {
if(num == 0 || num == 1) {
return num }
else {
fibre(num -1) + fib_re(num -2) }
}
val x = 10
fib_re(x)

//Fibonacci5
def fib_loop(num: Int): Int = {
while(i<num){
val n = a + b
a = b
b = n
i = i + 1 }
return a
}
fib_loop(10)

//Fibonacci6
var a = 0; var b = 1; var i =  0
def fib_loop_for(num: Int): Int = {
var n1 = a; var n2 = b
for(i<- 0 until num) {
val n = n1 + n2
n1 = n2
n2 = n }
return n1
}
fib_loop_for(10)