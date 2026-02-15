# Practica-de-nivelacion-con-manejo-de-GIT
Primera entrega de el curso de Programación II

# Parte Teórica – Git y Markdown
# 1. ¿Qué es Markdown?

Markdown es un lenguaje de marcado ligero creado en 2004 que permite dar formato a texto utilizando una sintaxis simple y fácil de leer. Es ampliamente utilizado para documentación técnica, archivos README, blogs y documentación en proyectos de software.

## Características principales:
- Sintaxis sencilla
- Fácil conversión a HTML
- Ideal para documentación técnica
- Compatible con GitHub y otras plataformas

## Ejemplos básicos:

# Título
## Subtítulo
**Negrita**
*Itálica*
- Lista
- Elemento

---

# 2. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un directorio que contiene los archivos del proyecto y una carpeta oculta llamada '.git' donde se almacena todo el historial de cambios.

## Diferencias:

Proyecto Normal -> Repositorio Git
Solo archivos -> Archivos + historial
No guarda versiones -> Guarda versiones completas
No permite revertir fácilmente -> Permite volver a versiones anteriores

---

# 3. ¿Cuáles son las tres áreas principales de Git?

Git trabaja con tres zonas:

## 1. Working Directory
Es el directorio donde editas los archivos.

## 2. Staging Area (Index)
Zona intermedia donde preparas los cambios antes de confirmarlos.
Se usa con: git add archivo.txt

## 3. Repository
Es donde se almacenan permanentemente los commits.

Flujo:
Working Directory -> Staging Area -> Repository

---

# 4. ¿Cómo representa Git los cambios internamente?

Git usa cuatro tipos de objetos:

## Blob
Almacena el contenido de un archivo.

## Tree
Representa una carpeta y su estructura.

## Commit
Contiene:
- Referencia a un tree
- Referencia al commit padre
- Autor
- Fecha
- Mensaje

## Tag
Etiqueta un commit específico.

Todos los objetos son identificados mediante un hash único (SHA-1).

---

# 5. ¿Cómo se crea un commit y qué información almacena?

Se crea con: git commit -m "mensaje"

Un commit almacena:
- Snapshot completo del proyecto
- Autor
- Email
- Fecha
- Commit padre
- Hash único

Git guarda una fotografía del estado del proyecto en ese momento.

---

# 6. ¿Cuál es la diferencia entre git pull y git fetch?

## git fetch
Descarga los cambios del repositorio remoto pero no los fusiona.

## git pull
Descarga y fusiona automáticamente los cambios.
Equivale a: git fetch + git merge

---

# 7. ¿Qué es un branch y cómo Git gestiona los punteros?

Un branch es un puntero a un commit específico.

Cuando se crea un nuevo commit, el puntero del branch se mueve hacia adelante.

HEAD es un puntero que indica en qué rama estás trabajando.

Cambiar de rama: git checkout nombre-rama

---

# 8. ¿Cómo se realiza un merge y qué conflictos pueden surgir?

Se ejecuta con: git merge nombre-rama

Tipos:
- Fast-forward
- Merge commit

## Conflictos ocurren cuando:
- Dos ramas modifican la misma línea
- Una rama elimina un archivo que otra modifica

Git marca los conflictos en el archivo y deben resolverse manualmente.

---

# 9. ¿Cómo funciona el área de staging y qué pasa si la omito?

El staging permite seleccionar exactamente qué cambios incluir en el commit.

Si no usas `git add`, no podrás hacer commit porque Git no sabrá qué cambios confirmar.

Permite hacer commits parciales y organizados.

---

# 10. ¿Qué es el archivo .gitignore?

Es un archivo que indica qué archivos o carpetas Git debe ignorar.

Ejemplo: 
- node_modules/
- .env
- *.log

Sirve para:
- No subir archivos sensibles
- Evitar archivos temporales
- Mantener limpio el repositorio

---

# 11. ¿Cuál es la diferencia entre git commit --amend y un nuevo commit?

## git commit --amend
Modifica el último commit.
- Cambia el mensaje
- Agrega archivos olvidados
Reescribe el historial.

## Nuevo commit
Crea un commit adicional sin modificar el anterior.

---

# 12. ¿Cómo se utiliza git stash y en qué escenarios es útil?

Guarda cambios temporalmente sin hacer commit: 
- git stash

Recuperar cambios: 
- git stash pop

Útil cuando:
- Necesitas cambiar de rama rápidamente
- No quieres hacer un commit incompleto

---

# 13. ¿Qué mecanismos ofrece Git para deshacer cambios?

## git reset
Mueve el puntero del branch.
- --soft → conserva cambios
- --mixed → quita del staging
- --hard → elimina cambios

## git revert
Crea un commit nuevo que revierte uno anterior.
Es seguro para repositorios compartidos.

## git checkout
Restaura archivos o cambia de rama.

---

# 14. ¿Cómo funciona la configuración de remotos (origin y upstream)?

## origin
Repositorio remoto principal: 
- git remote add origin URL

## upstream
Repositorio original cuando trabajas con un fork: 
- git remote add upstream URL

Actualizar fork:
- git fetch upstream
- git merge upstream/main

---

# 15. ¿Cómo inspeccionar el historial de commits?

## git log
Muestra el historial: 
- git log --oneline --graph

## git diff
Muestra diferencias entre archivos o ramas: 
- git diff
- git diff rama1 rama2

## git show
Muestra detalles de un commit específico.
- git show hash

