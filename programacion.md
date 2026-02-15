# 16. ¿Cuáles son los tipos de datos primitivos en Java?

En Java existen 8 tipos de datos primitivos. No son objetos y almacenan valores simples directamente en memoria.

## Tipos numéricos enteros:
- byte -> 8 bits
- short -> 16 bits
- int -> 32 bits
- long -> 64 bits

## Tipos numéricos decimales:
- float -> 32 bits
- double -> 64 bits

## Tipo carácter:
- char -> 16 bits (Unicode)

## Tipo lógico:
- boolean -> true o false

Ejemplo:
```java
- int edad = 20;
- double salario = 1500.50;
- boolean activo = true;
- char letra = 'A';
```
--- 

# 17. ¿Cómo funcionan las estructuras de control de flujo en Java?

Las estructuras de control permiten decidir el flujo del programa.

## Condicionales
```java
if
- Ejecuta un bloque si se cumple una condición.
if (edad >= 18) {
    System.out.println("Es mayor de edad");
}

if - else
- Permite una alternativa
if (edad >= 18) {
    System.out.println("Mayor");
} else {
    System.out.println("Menor");
}

switch
- Evalua multiples casos
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
}
```
## Bucles
```java
for
- Se usa cuando sabemos cuántas veces repetir.
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

while
- Se ejecuta mientras la condición sea verdadera.
while (contador < 5) {
    contador++;
}

do-while
- Se ejecuta al menos una vez.
do {
    contador++;
} while (contador < 5);
```
---

# 18. ¿Por qué es importante usar nombres significativos para variables y métodos?

Usar nombres claros mejora:
- Legibilidad del código
- Mantenimiento
- Trabajo en equipo
- Comprensión futura del proyecto

Ejemplo incorrecto:
```java
int x = 10;
```
Ejemplo correcto:
```java
int edadUsuario = 10;
```

Buenas prácticas:
- Usar camelCase
- Evitar abreviaciones innecesarias
- Que el nombre describa la función

---

# 19. ¿Qué es la Programación Orientada a Objetos (POO)?
La POO es un paradigma de programación basado en objetos.

Un objeto es una entidad que tiene:
- Atributos (datos)
- Métodos (comportamientos)

Ejemplo:
```java
class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola");
    }
}
```
La POO permite modelar la realidad mediante clases y objetos.

---

# 20. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
1. Encapsulamiento
- Ocultar los datos internos y protegerlos mediante métodos.

2. Abstracción
- Mostrar solo lo esencial y ocultar detalles complejos.

3. Herencia
- Permite que una clase herede atributos y métodos de otra.

4. Polimorfismo
- Permite que un mismo método tenga diferentes comportamientos.

---

# 21. ¿Qué es la herencia en POO y cómo se utiliza en Java?
La herencia permite crear una clase basada en otra.

Se usa con la palabra clave extends.

Ejemplo:
```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Guau");
    }
}
```
La clase Perro hereda métodos de Animal.
Ventajas:
- Reutilización de código
- Organización jerárquica
- Menos duplicación

---

# 22. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Controlan la visibilidad de clases, atributos y métodos.

## public
Accesible desde cualquier lugar.

## private
Solo accesible dentro de la misma clase.

## protected
Accesible dentro del mismo paquete y por herencia.

## default (sin palabra clave)
Accesible solo dentro del mismo paquete.

Ejemplo:
```java
private int edad;
public void setEdad(int edad) {
    this.edad = edad;
}
```

# 23. ¿Qué es una variable de entorno y por qué son importantes?

Una variable de entorno es un valor almacenado en el sistema operativo que puede ser utilizado por aplicaciones.

En Java es importante para:
- Configurar el PATH
- Definir JAVA_HOME
- Configurar entornos de desarrollo

Ejemplo:
JAVA_HOME -> Ruta donde está instalado el JDK.

Son importantes porque:
- Permiten configurar el entorno sin modificar el código
- Mejoran seguridad y portabilidad

---