//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo

scala> def radio(Area:Double):Double={
     | (math.sqrt(Area/3.1416))
     | }
radio: (Area: Double)Double

scala> radio(30.45)
res0: Double = 3.113280162302127

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo


scala> def isPrime(num:Int):Boolean =
     | (num>1)&& !(2 to scala.math.sqrt(num).toInt).exists(x =>num %x ==0)
isPrime: (num: Int)Boolean

scala> isPrime(20)
res1: Boolean = false

scala> isPrime(9)
res2: Boolean = false

scala> isPrime(17)
res3: Boolean = true

scala> isPrime(22)
res4: Boolean = false

scala> isPrime(26)
res5: Boolean = false

scala> isPrime(30)
res6: Boolean = false

scala> isPrime(5)
res7: Boolean = true

scala> isPrime(8)
res8: Boolean = false

scala> isPrime(3)
res9: Boolean = true

scala> isPrime(11)
res10: Boolean = true

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"

scala> var bird = "tweet"
bird: String = tweet

scala> println(s"Estoy escribiendo un $bird")
Estoy escribiendo un tweet

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la
//   secuencia "Luke"





scala> var mensaje= "Hola Luke soy tu padre"
mensaje: String = Hola Luke soy tu padre

scala> mensaje.slice(5,9)
res12: String = Luke


//5. Cual es la diferencia en value y una variable en scala?


scala> val Num=1
Num: Int = 1

scala> Num1=2
<console>:25: error: not found: value Num1
val $ires6 = Num1
             

       ^

scala> var Num2=2
Num2: Int = 2

scala> var Num2=3
Num2: Int = 3

//6. Dada la tupla ((2,4,5),(1,2,3),(3.1416,23))) regresa el numero 3.1416 




scala> val Num=1
Num: Int = 1

scala> Num1=2
<console>:25: error: not found: value Num1
val $ires6 = Num1
             ^
<console>:23: error: not found: value Num1
       Num1=2
       ^

scala> var Num2=2
Num2: Int = 2

scala> var Num2=3
Num2: Int = 3
