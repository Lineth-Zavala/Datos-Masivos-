def breakingRecords(games:Array[Int]): List[Int] = { 

var max = games(0) 
var countMax = 0 
var min = games(0) 
var countMin = 0 
for ( i <- games) { 
if ( i > max ){ 
max = i
countMax += 1 
}else if( i < min) { 
min = i 
countMin += 1
}
}
var MyList = List(countMax,countMin) 
return MyList
}
var totalgames = 9 
var games = Array(10,5,20,20,4,5,2,25,1) 
var games2 = Array(3,4,21,36,10,28,35,5,24,42)

println(breakingRecords(games)) 
println(breakingRecords(games2))
