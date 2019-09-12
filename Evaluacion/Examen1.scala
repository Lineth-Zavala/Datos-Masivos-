
def breakingRecords(games:Array[Int]): Array[Int] = { //funcion para para obtener la matriz de enteros con el numero de veces que rompio sus registros

var max = games(0)  // variable Max describe la Mayoria de puntos
var countMax = 0 // variable CountMax cuenta la Mayoria de puntos
var min = 0 //variable MIN describe los menores puntos para la entrada (input)
var min2 = games(0) //variable MIN describe los menores puntos para la salida (output)
var countMin = 0 // variable CountMin cuenta la Menor cantidad de puntos para la entrada (input)
var countMin2 = 0 // variable CountMin cuenta la Menor cantidad de puntos para la salida (output)
var first = true // variable verdadera
// for ( i<-games) 
for ( i <- games) { // ciclo for para llevar los registros
if (first)//declaramos que si es verdadero obtendremos el input
{ 
min = i
countMin += 1
}//comenzamos par aobtener la salida se creo este condicionado
if ( i > max )
{ 
max = i
countMax += 1 
}
else if( i < min2) 
	{ 
	min2 = i 
	countMin2 += 1
	}
}

Array(countMin,countMax,countMin2) // muestra los datos
}

var games = Array(10,5,20,20,4,5,2,25,1) // variables Games que muestran los numeros respectivos de score 
var games2 = Array(3,4,21,36,10,28,35,5,24,42)//

println(breakingRecords(games).mkString(" ")) // despliega los datos games 1
println(breakingRecords(games2).mkString(" "))// despliega los datos games 2