# A-correr-que-es-muy-saludable-
**Descripción del problema**

Una entidad deportiva ha organizado una carrera multitudinaria en el marco de los festejos por el Bicentenario.
Los organizadores piensan clasificar a los competidores según su categoría y sexo: Las categorías se asignan según
rangos de edades y su cantidad puede variar de una competencia a otra, a criterio de quienes la organizan. Los sexos
son naturalmente dos: masculino y femenino. Al inscribirse los corredores informan su edad y reciben un número que
deben llevar abrochado en la remera. Los números de corredor se asignan correlativamente.
A medida que los competidores van arribando uno detrás de otro a la meta, los fiscales de la competencia registran el
número del corredor. Se te pide que escribas un programa carrera.cpp, carrera.c o carrera.pas que determine los ganadores de oro, plata
y bronce para cada categoría y sexo, para establecer los integrantes de los podios.

*Datos de entrada:*

Se recibe un archivo carrera.in con el siguiente formato:
• Una línea que indica: la cantidad A
( 1 ≤ A ≤ 1.000.000 ) de competidores
inscriptos, cf y cm ( 1 ≤ cf, cm ≤ 60 ) la
cantidad de categorías por sexo
respectivamente, y L ( 0 ≤ L ≤ Α ) la
cantidad de corredores que arribaron a la
meta, todos separados por blanco.

• cf líneas con los rangos Fn, Fx de
edades de cada categoría femenina (10 ≤
Fn ≤ Fx ≤ 80) y cm líneas con los rangos
de edades de cada categoría masculina
Mn, Mx (10 ≤ Mn ≤ Mx ≤ 80). Las
categorías se dan en orden creciente; los
rangos obviamente son disjuntos y sus
cotas están separadas por blanco.

• A líneas con los pares E, X
correspondientes a la edad ( 10 ≤ E ≤ 80 )
y sexo (M / F) de los corredores inscriptos,
en orden de inscripción (números
correlativos, comenzando desde 1),
separados por blanco.

• L líneas con los números de los
corredores arribados a la meta, por orden
de llegada.

*Datos de salida:*

Se debe generar un archivo
carrera.out conteniendo

• cf+cm líneas, conteniendo cada una el
número de categoría y los 3 números
de los corredores que merecieron oro,
plata y bronce, separados por blanco.
Se deben listar ordenados por número
de categoría, primero las cf
correspondientes a las damas y luego
las cm de los caballeros. Si en alguna
categoría llegaron menos de 3
participantes, los premios
correspondientes se declaran desiertos
y se debe colocar un 0(cero) como
número de corredor.

**Ejemplo:**

carrera.in | carrera.out
---------- | -----------
10 3 1 8 | 1 3 1 0
10 35 | 3 4 10 0
36 36 | 2 0 0 0
37 60 | 1 8 5 9
20 70
13 F
41 M
18 F
56 F
70 M
38 F
48 M
20 M
48 M
57 F
3
8
1
4
5
10
9
2
