// Funciones Agregadas - Crear 20 funciones con la siguiente base de datos CitiGroup2006_2008

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("BigData/Spark_DataFrame/CitiGroup2006_2008")

df.printSchema()

import spark.implicits._

df.select(countDistinct($"Open")).show() // Nos regresa el conteo de todos los valores distintos no nulos que se especificaron de la expresión mostrada.
df.select(sumDistinct($"Open")).show() //Además de sumar un total, también puede sumar un conjunto distante de valores.
df.select(collect_set($"Open")).show() //Nos regresa un conjunto de objetos con elementos duplicados eliminados.
df.select(collect_list($"Open")).show() // Regresa una lista de objetos con duplicados.
df.select(max($"High")).show() // Nos devolvera el valor máximo de la expresión en un grupo.
df.select(log($"High")).show() //Nos regresara el primer logaritmo basado en argumentos del segundo argumento.
df.select(min("Open")).show() //Regresa el valor mínimo de todos los valores numéricos no NULL especificados por la expresión, en el contexto del ámbito especificado. Puede usarla para especificar un valor mínimo para el eje del gráfico para controlar la escala.
df.select($"Open".as("OPEN")).show() //Se generara un alias como una etiqueta para facilitar algunos nombres de tablas o atributos.
df.select(sum($"Low")).show() //Nos devuelve la suma de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(variance($"Open")).show() //Regresa la varianza de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(var_pop($"Open")).show() //Nos retorna la varianza de población de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(var_samp($"Open")).show() //En el resultado de la función VAR_SAMP es equivalente a la desviación cuadrada estándar de la muestra del mismo conjunto de valores.
df.select(length($"Open")).show() //Aqui se calcula la longitud de una cadena o columna binaria dada.
df.select(skewness($"Open")).show() //Nos devuelve el sesgo de los valores en un grupo.
df.select($"Low".name("LOW")).show() //Aqui Cambia el valor de la tabla
df.select(count($"Low")).show() //Nos retornara un recuento de los valores no NULL especificados por la expresión, que se evalúa en el contexto del ámbito indicado.
df.select(avg($"Open")).show() //Nos devuelve el promedio de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(countDistinct($"Open")).show() //Nos regresa un recuento de todos los valores no NULL distintos especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(stddev("Low")).show() ///Regresa la desviación estándar de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.
df.select(corr("High", "Low")).show() //Nos devuelve la correlacion
df.select(stddev_pop("Low")).show //Nos devolvera la desviación estándar de población de todos los valores numéricos no NULL especificados por la expresión, que se evalúa en el contexto del ámbito especificado.