Integración Numérica usando Simpson 1/3 – Programación Funcional en Scala
Objetivo

Aplicar los conocimientos sobre funciones de orden superior.

Enviar funciones como parámetros para resolver integrales definidas.

Método

El método utilizado es Simpson 1/3, cuya fórmula es:

∫
𝑎
𝑏
𝑓
(
𝑥
)
 
𝑑
𝑥
≈
(
𝑏
−
𝑎
)
 
𝑓
(
𝑎
)
+
4
𝑓
(
𝑎
+
𝑏
2
)
+
𝑓
(
𝑏
)
6
∫
a
b
	​

f(x)dx≈(b−a)
6
f(a)+4f(
2
a+b
	​

)+f(b)
	​


El punto clave es evaluar la función en:

el límite inferior a

el límite superior b

el punto medio (a+b)/2

y combinarlos según la fórmula.

Función integracion
def integracion(f: Double => Double, a: Double, b: Double): Double =
  val xBar = (a + b) / 2
  (b - a) * (f(a) + 4 * f(xBar) + f(b)) / 6

¿Qué devuelve esta función?

Devuelve un Double, porque el resultado de una integral es un valor real.

Parámetros que recibe

f: Double => Double
La función matemática a integrar.

a: Double
Límite inferior de integración.

b: Double
Límite superior de integración.

Esta función es de orden superior porque recibe otra función como parámetro.

Estructura del código

integracion → aplica Simpson 1/3

Funciones f1 a f7 → cada una representa un integrando diferente

resultadoX → aproximación de cada integral

errorX → diferencia absoluta entre el valor esperado y el obtenido

Fragmento de uso
val resultado1 = integracion(f1, 3, 5)
val error1 = error(7.33, resultado1)

Resultados
Integral	Aproximación	Valor esperado	Error
I1	7.329	7.33	0.001
I2	8.0	8.0	0.0
I3	3.332	3.333	0.001
I4	1.0986	1.09861	0.00001
I5	1.7182	1.71828	0.00008
I6	0.8284	0.828427	0.00003
I7	0.7853	0.785398	0.0001
Conclusión

Simpson 1/3 ofrece buenas aproximaciones usando solo tres evaluaciones de la función.

Scala permite trabajar de forma clara con funciones de orden superior.

El cálculo del error ayuda a comprobar la precisión del método para cada integral.
​
 (−x 
2
 +8x−12)dx≈7.33
