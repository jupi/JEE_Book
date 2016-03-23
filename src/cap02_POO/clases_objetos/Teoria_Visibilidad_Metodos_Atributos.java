/*

Podremos invocar cualquier método definido como public, como: todos
los constructores y los métodos toString, equals, addDias, etc. Si la clase tuviese
atributos definidos como public, entonces podríamos manipularlos directamente desde
cualquier método dentro de cualquier clase.

En general, se estila que los atributos sean private y los métodos public. Si para
desarrollar un método complejo tenemos que dividirlo (estructurarlo) en varios métodos
más simples, estos probablemente deberían ser private para prevenir que el usuario
los pueda invocar. Con esto, le evitaremos al usuario confusiones y pérdidas de tiempo
innecesarias.

Existen dos niveles más de visibilidad: protected y friendly.
El primero hace que un método o variable sea visible dentro de la cadena de herencia (es
decir, en todas las subclases) pero que no lo sea por fuera de esta.
El segundo (friendly) no existe como tal. Es un modificador tácito que surge cuando omitimos
definir explícitamente alguno de los modificadores anteriores. En otras palabras,
si a un miembro de la clase no lo definimos como private, protected o public
entonces (por omisión) será friendly.
Un método o variable friendly será accesible por todas las clases que comparten el mismo
paquete, pero no lo será para las clases que estén ubicadas en otros paquetes.

*/