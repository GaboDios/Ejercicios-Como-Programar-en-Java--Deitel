# Ejercicios-Como-Programar-en-Java--Deitel
En este repositorio se encuentran los ejercicios resueltos del libro.

# Capitulo 2
2.1 Complete las siguientes oraciones:
a) El cuerpo de cualquier método comienza con un(a) (llave de apertura) y termina con una (llave de cierre).
b)Toda instruccion termina con un punto y coma.
c)La instruccion (if) (presentada en este capítulo) se utiliza para tomar decisiones.
d)// indica el inicio de un comentario de fin de linea.
e) El espacio, el tabulador, el salto de linea y el retorno de carro se conocen como espacio en blanco.
f) Las palabras clave están reservadas para su uso en Java
g) Las aplicaciones en Java comienzan su ejecución en el método main.
h) Los métodos print, println y printf muestran información en la ventana de comandos.


2.2 Indique si cada una de las siguientes instrucciones es verdadera o falsa. Si es falsa explique por qué.
a) Los comentarios hacen que la computadora imprima el texto que va después de los caracters // en la pantalla, al ejecutarse un programa.
FALSO Los comentarios son ignorados por la computadora, lo que imprime texto son los métodos de h en 2.1
b)Todas las variables deben recibir un tipo cuando se declaran
verdadero
c)Java considera que las variables numero y NuMeRo son idénticas.
FALSO Java distingue las variables con mayusculas como variables distintas.
d) El operador residuo (%) puede utilizarse solamente con operandos enteros
FALSO El operador residuo puede utilizarse tanto con enteros como con operandos de punto flotante.
e)Los operadores aritméticos *, /, %, + y- tienen todos el mismo nivel de precedencia?
FALSO *, /, % tienen el mismo nivel de precedencia, pero + y- están un nivel más abajo


2.4 Identifique y corija los errores en cada una de las siguientes instrucciones.
a) if ( c < 7 ):
    System.out.println("c es menor que 7");
        Correccion:
    if ( c < 7 )
    System.out.println ("c es menor que 7");

b) if (c => 7)
    System.out.println("c es igual o mayor que 7");
        Correccion:
    if (c >= 7)
    System.out.println("c es igual o mayor que 7");


2.5 Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas:
a) Indicar que un programa calculará el producto de tres enteros.
//Programa que calcula el producto de tres enteros.
b) Crear un objeto Scanner que lea valores de la entrada estándar.
Scanner entrada = new Scanner(System.in);
c)Declarar las variables x, y, z y resultado de tipo int.
int x;
int y;
int z;
int resultado;
d)Pedir al usuario que escriba el primer entero.
System.out.println("Escribe el primer entero");
e)Leer el primer entero del usuario y almacenarlo en la variable x
x = entrada.nextInt();
f)Pedir al usuario que escriba el segundo entero
System.out.println("Escribe el segundo entero");
g) Leer el segundo entero del usuario y almacenarlo en la variable y
y = entrada.nextInt();
h)Pedir al usuario que escriba el tercer entero.
System.out.println("Escribe el tercer entero");
i) Leer el tercer entero del usuario y almacenarlo en la variable z
x = entrada.nextInt();
j) Calcular el producto de los tres enteros contenidos en las variables x, y, z y asignar el resultado a una variable resultado
resultado = x * y * z;
k) Mostrar el mensaje "El producto es", seguido del valor de la variable resultado
System.out.println("El producto es " + resultado);


2.7 Complete las siguientes oraciones.
a) Los comentarios se utilizan para documentar un programa y mejorar su legibilidad.
b) Una decisión puede tomarse en un programa en Java con un(a) if.
c)Los cálculos se realizan normalmente mediante instrucciones aritméticas.
d)Los operadores aritméticos con la misma precedencia que la mutliplicasion son: la division / y el residuo &.
e)Cuando los paréntesis en una expresión aritmética están anidados, el conjunto interior de paréntesis se evalúa primero.
f) Una ubicación en la memoria de la computadora que puede contener distintos valores en diversos instantes de tiempo, durante la ejecución de un programa se llama variable.


2.8 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
a) Mostrar el mensaje "Escriba un entero:", dejando el cursor en la misma 
System.out.print("Escriba un entero);
b)Asignar el producto de las variables b y c a la variable a
a = b * c;
c)Indicar que un programa va a realizar un cálculo de nómina de muestra
//El programa va a realizar un cálculo de nómina de muestra.


2.9 Conteste con verdadero o falso a cada una de las siguientes proposiciones; en caso de ser falso, explique por qué.
 a) Los operadores en Java se evalúan de izquierda a derecha.
 Falso Los operadores en Java se evaluan dependiento su nivel de precedencia
 b) Los siguientes nombres de variables son todos válidos: _barra_inferior_, m928134, t5, j7, sus_ventas$,
su_$cuenta_total, a, b$, c, z y z2.
Verdadero
 c) Una expresión aritmética válida en Java sin paréntesis se evalúa de izquierda a derecha.
Verdadero
 d) Los siguientes nombres de variables son todos inválidos: 3g, 87, 67h2, h22 y 2h.
 Falso h22 Es un nombre de variable valido ya que inicia con una letra.

 2.10 Suponiendo que x = 2 y y = 3, ¿qué muestra cada una de las siguientes instrucciones?
 a) System.out.printf( "x = %d\n", x );
 x = 2
 b) System.out.printf( "El valor de %d + %d es %d\n", x, x, ( x + x ) );
 El valor de 2 + 2 es 4
 c) System.out.printf( "x =" );
 x =
 d) System.out.printf( "%d = %d\n", ( x + y ), ( y + x ) );
 5 = 5

 2.11 ¿Cuáles de las siguientes instrucciones de Java contienen variables, cuyos valores se modifican?
 a) p = i + j + k + 7;
 Sí modifica la variable p al asignarle el valor de i + j + k + 7
 b) System.out.println( "variables cuyos valores se destruyen" );
 No modifica ninguna variable, ya que simplemente imprime un mensaje en la consola.
 c) System.out.println( "a = 5" );
 No modifica ninguna variable simplemente imprime a = 5
 d) valor = entrada.nextInt();
 Modifica la variable valor al asignarle el valor leído desde la entrada estandar mediante el método nextInt() de Scanner.

 
 2.12 Dado que y = ax^3 + 7, ¿cuáles de las siguientes instrucciones en Java son correctas para esta ecuación?
 a) y = a * x * x * x + 7;
 Correcto
 b) y = a * x * x * ( x + 7 );
 Incorrecto
 c) y = ( a * x ) * x * ( x + 7 );
 Incorrecto
 d) y = ( a * x ) * x * x + 7;
 Correcto
 e) y = a * ( x * x * x ) + 7;
 Correcto
 f) y = a * x * ( x * x + 7 );
 Incorrecto


2.13 Indique el orden de evaluación de los operadores en cada una de las siguientes instrucciones en Java, y muestre
el valor x después de ejecutar cada una de ellas:
 a) x = 7 + 3 * 6 / 2 – 1;
x = 7 + 18 / 2 - 1
x = 7 + 9 - 1
x = 16 - 1
x = 15
 b) x = 2 % 2 + 2 * 2 – 2 / 2;
x = 0 + 2 * 2 - 2 /2
x = 4 - 2/2
x = 4 - 1
x = 3
 c) x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
x = ( 3 * 9 * ( 3 + ( 9 * 3 / 3 ) ) )
x = ( 3 * 9 * ( 3 + ( 27 / 3 ) ) )
x = ( 3 * 9 * ( 3 + 9 ) )
x = ( 3 * 9 * ( 12 ) )
x = ( 3 * 9 * 12 )
x = ( 27 * 12 )
x = 324


2.20 ¿Qué imprime el siguiente código?
 System.out.println( "*" );
 System.out.println( "***" );
 System.out.println( "*****" );
 System.out.println( "****" );
 System.out.println( "**" );
El código imprime:
*
***
*****
****
**

 2.21 ¿Qué imprime el siguiente código?
 ***************


2.22 ¿Qué imprime el siguiente código?
****
*****
******


2.23 ¿Qué imprime el siguiente código?
*
***
*****

# Capitulo 3

Complete las siguientes oraciones:

a) Una casa es para un plano de construcción lo que un(a) objeto para una clase.

b)Cada declaración de clase que empieza con la palabra clave public debe almacenarse en un archivo que tenga exactamente el mismo nombre de la clase, y que termine con la extensión de archivo .java.

c)Cada declaración de clase contiene la paalbra clave class, seguida inmediatamente por el nombre de la clase.

d)La palabra clave new crea un objeto de la clase especifica a la derecha de la palabra clave.

e) Cada parámetro debe especificar un tipo y un nombre

f) De manera predeterminada, se considera que las clases que se compilan en el mismo directorio están en el mismo paquete conocido como paquete predeterminado

g) Cuando cada objeto de una clase mantiene su propia copia de un atributo, el campo que representa a este atributo se conoce también como variable de instancia.

h) Java proporciona dos tipos primitivos para almacenar números de punto flotante en la memoria float y double

i) Las variable de tipo double representan a los números de punto flotante de precisión doble.

j)El método nextDouble de la clase Scanner devuelve el valor double

k) La palabra clave public es un modificar de acceso 

l) El tipo de valor de retorno void indica que un método realizará una tarea, pero no devolverá información cuando complete su tarea

m)El método nextLine de Scanner lee caracteres hasta encontrar una nueva línea, y después devuelve esos caracteres como un objeto String.

n)La clase String está en el paqueta java.lang

o) NO se requiere una declaracion import si siempre hacemos referencia a una clase con su nombre de clase completamente calificado

p) Un número de punto flotante es un número con un punto decimal como 7.33 o 0.0975 o 1000.12345

q)Las variable de tipo float representan número de punto flotante de presición simple.

r) El especificador de formato %f se utiliza para mostrar valores de tipo float o double

s)Los tipos en Java se dividen en dos categorías: tipos primitivos y tipos por referencia.

3.2 Conteste verdadero o falso a cada una de las siguiente proposiciones; en caso de ser falso, explique por qué.

a) Por convención, los nombres de los métodos empiezan con la primera letra en mayúscula y todas las palabras subsiguientes en el nombre empiezan con la primera letra en mayúscula.

Falso, Por convención los nombres de los métodos empiezan con la primera letra en minúscula y todas las palabras subsiguientes en el nombre empiezan con la primera letra en mayúscula.

b)Una declaración import no es obligatoria cuando una clase en un paquete utiliza a otra en el mismo paquete.

Verdadero.

c)Los paréntesis vacíos que van después del nombre de un método en la declaración de un método indican que éste no requiere parámetros para realizar su tarea.

Verdadero

d)Las variables o los métodos declarados con el modificador de acceso private son accesibles sólo para los métodos de la clase en la que se declaran.

Verdadero

e)Una variable de tipo primitivo puede usarse para invocar un método.

Falso, lo que pueden usarse para invocar un método es una referencia a un objeto.

f)Las variables que se declaran en el cuerpo de un método específico se conocen como variables de instancia, y pueden utilizarse en todos los métodos de la clase.

Falso. Dichar variables se llaman variables locales, y sólo se pueden utilizar en el método en que están declaradas.

g) El cuerpo de cada método está delimitado por llaves izquierda y derecha ({y})

Verdadero

h)Las variables locales de tipo primitivo se inicializan de manera predeterminada.

Falso. Las variables de instancia de tipo primitivo se inicializan de forma predeterminada. A cada variable local se le debe asignar un valor de manera explícita.

i)Las variables de instancia por referencia se inicializan de manera predeterminada con el valor null.

Verdadero

j)Cualquier clase que contenga public static void main (String[] args) puede usarse para ejecutar una aplicación

Verdadero.

k)El número de argumentos en la llamada a un método debe coincidir con el número de parámetros en la lista de parámetros de la declaración del método.

Verdadero.

l)Los valores de punto flotante que aparecen en codigo fuente se conocen como literales de punto flotante, y son de tipo float de manera predeterminada.

Falso. Dichas literales son de un tipo double de manera predeterminada.

3.3 ¿Cuál es la diferencia entre una variable local y un campo?

Una variable local se declara en el cuerpo de un método y solo puede usarse desde el momento en que se declaró, hasta el final de la declaración del método. Un campo se declara en una clase, pero no en el cuerpo de alguno de los métodos de la clase. Cada instancia de una clase tiene una copia separada de los campos de la clase. Además, los campos están accesibles para todos los métodos de la clase.

3.4 Explique el propósito de un parámetro de un método. ¿Cuál es la diferencia entre un parámetro y un argumento?

Un parámetro representea la información adicional que un método requiere para realizar su tarea. Cada parámetro requerido por un método está especificado en la declaración del método. Un argumento es el valor actual para un parámetro del método. Cuando se llama a un método, los valores de los argumentos se pasan al método, para que este pueda realizar su tarea.

3.5 ¿Cuál es el proposito de la palabra clave new? Explique lo que ocurre cuando se utiliza en una aplicación.

El proposito de new es la creación de un objeto de alguna clase. Cuando se utiliza en una aplicación, crea una instancia de alguna clase.

3.6 ¿Qué es el constructor predeterminado? ¿Cómo se inicializan las variables de instancia de un objeto, si una clase sólo tiene un constructor predeterminado?

El constructor predeterminado es un constructor que Java proporciona automáticamente si no se define ninguno explícitamente en una clase, no toma parámetros e inicializa las variables de instancia del objeto a sus valores predeterminados (0 en tipos numéricos, false para booleanos y null para referencias)

3.7 Explique el propósito de una variable de instancia

El proposito de una variable de instancia es almacenar datos o atributos específicos de un objeto creado a partir de una clase

3.8 La mayoría de las clases necesitan importarse antes de poder utilizaralas en una aplicación ¿Por qué cualquier aplicación puede utilizar las clases system y String sin tener que importarlas primero?

Porque estas clases se encuentran en el paquete java.lang que es el paquete base de java. Este paquete se importa automáticamente en todas las aplicaciones de Java.

3.9 Explique como utilizaría un programa la clase Scanner, sin importarla del paquete java.util

Se puede hacer referenciandola directamente mediante su nombre completo calificado. i.e incluyendo el nombre completo del paquete seguido del nombre de la case cada vez que se desee usar.
Por ejemplo:
java.util.Scanner entrada = new java.util.Scanner(System.in);

3.10 Explique por qué una clase podría proporcionar un método establecer y un método obtener par una variable de instancia.

Si se requiere establecer el valor de algun atributo de una clase se puede proporcionar un método establecer, como si quisieras establecer la cantidad de gasolina de una clase automovil. Si se requiere saber el valor de algun atributo se puede proporcionar un método obtener, por ejemplo si quisieras obtener el saldo de alguna clase cuentaDeDebito.

