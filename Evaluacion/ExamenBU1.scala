//Zavala Zuñiga Lineth 14212347 Examenb

// # 1. Comienza una simple sesion Spark 
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

// # 2. Cargue el archivo Netflix Stock CSV, haga que Spark infiera los tipos de datos
val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/lineth/Descargas/BigData-master/Spark_DataFrame/Netflix_2011_2016.csv")

// # 3. ¿Cuáles son los nombres de las columnas?
df.columns

// # 4. ¿Cómo es el esquema?
df.printSchema()

// # 5. Imprime las primeras 5 columnas
df.select("Date","Open","High","Low","Close","Volume","Adj Close").show(5)
df.show(5)

// # 6. Usa describe() para aprender sobre el DataFrame
df.describe().show()

// # 7 Crea un nuevo dataframe con una columna nueva llamada "HV Ratio" que es la relación entre el precio de la columna "High" frente ala columna "Volumen" de acciones negociadas por un día
val df2 = df.withColumn("HV Ratio",df("High")/df("Volume"))
df2.printSchema()
df2.show()

// # 8. ¿Que dia tuvo Peak High en Price?

// # 9. ¿Cuál es el significado de la columna Cerrar "Close"?
println("Son los valores de cierre de las inversiones de Netflix durante los dias analizados")

// # 10. ¿Cuál es el máximo y mínimo de la columna "Volumen"?
df.select(min(df("Volume"))).show()
df.select(max(df("Volume"))).show()

// # 11. Con Sintaxis Scala/Spark $ conteste lo siguiente:
//a - ¿Cuántos días fue la columna "Close" inferior a $ 600?
df.filter($"Close"<600).count()

//11.-b - ¿Qué porcentaje del tiempo fue la columna "High" mayor que $ 500?
(df.filter($"High">500).count() * 1.0 / df.count()) * 100

//11.-c - ¿Cuál es la correlación de Pearson entre la columna "High" la columna "Volumen"?
df.select(corr("High","Volume")).show()

//11.-d - ¿Cuál es el máximo de la columna "High" por año?
val dfyear = df.withColumn("Year",year(df("Date")))
val maxyear = dfyear.select($"Year", $"High").groupBy("Year").max()
val res = maxyear.select($"Year", $"max(High)")
res.show()

//11.-e - ¿Cuál es el promedio de columna "CLose" para cada mes del calendario?
val dfmonth = df.withColumn("Month",month(df("Date")))
val avgmonth = dfmonth.select($"Month",$"Close").groupBy("Month").mean()
avgmonth.select($"Month",$"avg(Close)").orderBy("Month").show()

