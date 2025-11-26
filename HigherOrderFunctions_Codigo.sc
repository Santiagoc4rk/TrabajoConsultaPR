// 1. Función para integrar usando Simpson 1/3
def integracion(f: Double => Double, a: Double, b: Double): Double =
  val xBar = (a + b) / 2
  (b - a) * (f(a) + 4 * f(xBar) + f(b)) / 6

// 2. Función para calcular el error absoluto
def error(valorEsperado: Double, valorObtenido: Double): Double =
  Math.abs(valorEsperado - valorObtenido)

// 3. Funciones de las integrales
def f1(x: Double): Double = -Math.pow(x,2) + 8*x - 12
def f2(x: Double): Double = 3 * Math.pow(x,2)
def f3(x: Double): Double = x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4)
def f4(x: Double): Double = (2*x + 1) / (Math.pow(x,2) + x)
def f5(x: Double): Double = Math.exp(x)
def f6(x: Double): Double = 1 / Math.sqrt(x - 1)
def f7(x: Double): Double = 1 / (1 + Math.pow(x,2))


// 4. Aproximaciones usando integracion
val resultado1 = integracion(f1, 3, 5)
val resultado2 = integracion(f2, 0, 2)
val resultado3 = integracion(f3, -1, 1)
val resultado4 = integracion(f4, 1, 2)
val resultado5 = integracion(f5, 0, 1)
val resultado6 = integracion(f6, 2, 3)
val resultado7 = integracion(f7, 0, 1)

// 5. Errores correspondientes
val error1 = error(7.33, resultado1)
val error2 = error(8.0, resultado2)
val error3 = error(3.333, resultado3)
val error4 = error(1.09861, resultado4)
val error5 = error(1.71828, resultado5)
val error6 = error(0.828427, resultado6)
val error7 = error(0.785398, resultado7)
