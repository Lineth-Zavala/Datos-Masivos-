def breakingRecords(scores: Array[Int]): List[Int] ={
    var max = scores(0) 
    var countmax = scores(0) 
    var min = 0; 
    var countmin= 0; 
    for ( i <- scores){ 
        if (i > max) {
    max = i 
    countmax +=1
}else if ( i < min ){
    min = i 
    countmin += 1
}
}
      var myList = List (countmax, countmin)
return myList 
}
var totalscores = 9 
var games = Array (10,5,20,20,4,5,2,25,1)
var games2 = Array (3,4,21,36,10,28,35,5,24,42)

println(breakingRecords(games))
println(breakingRecords(games2))
