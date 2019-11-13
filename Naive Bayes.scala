

import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
 
// Cargue los datos almacenados en formato LIBSVM como un DataFrame
val data = spark.read.format("libsvm").load("data/sample_libsvm_data.txt")
 
// Dividir los datos en conjuntos de entrenamiento y prueba (30% para pruebas)
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3), seed = 1234L)
 
// entrenar el modelo naive bayes.
val model = new NaiveBayes().fit(trainingData)
 
// seleccionar las filas a desplegar
val predictions = model.transform(testData)
predictions.show()
 
// Seleccionar (predicción, etiqueta verdadera) y calcular error de prueba
 
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test set accuracy = $accuracy")