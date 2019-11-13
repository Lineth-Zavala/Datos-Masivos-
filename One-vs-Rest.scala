import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
 
// load data file.
val inputData = spark.read.format("libsvm").load("Data/sample_multiclass_classification_data.txt")
 
// genera la división tren / prueba.
val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))
 
// instanciar el clasificador base
val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)
 
// instanciar el clasificador One Vs Rest.
val ovr = new OneVsRest().setClassifier(classifier)
 
// entrena el modelo multiclase.
val ovrModel = ovr.fit(train)
 
// califica el modelo en los datos de prueba
val predictions = ovrModel.transform(test)
 
// obtener evaluador.
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
 
// calcula el error de clasificación en los datos de prueba.
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1 - accuracy}")
 
 
 
