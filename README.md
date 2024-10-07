_**PROYECTO DE JAVA PUCV**_

Es un proyecto enfocado en la creacion de software en el lenguaje de programacion Java (utilizando Maven). 

El software esta enfocado en facilitar la gestión de opiniones respecto a posibles políticas/leyes,normas,etc. Este software constará principalmente de funcionalidades
como:

-Buscar consulta/voto por ID.


-Agregar/Eliminar Votos de una consulta en específica.


-Ver estado de una consulta (Opinión popular).


_**Instalación (NetBeans IDE 23 y JDK 23)**_

**ULTIMA ACTUALIZACION**
En la ultima actualizacion del programa SistemaProyecto se realizaro la cracion de archivos .csv para permitir la permanencia de datos de consultas y votos, tambien se realizaron las funciones para poder cargar estos archivos, se creo una generacion de reporten en un archivo .csv y tambien la manera de actulizar el csv de Votos dentro de las consultas.
Una de las clases mas importantes es de la clase controladorMenu, que nos permite utilizar el menu de manera clara gracias a las clases de ActionListener y MouseClicked.
Creamos excepciones para la mayoria de edad a la hora de ingresar un voto y la de ingresar un RUT de manera clara y que no sea invalido.


Descargar zip del proyecto (main branch) y descomprimir en una carpeta, posteriormente abrir NetBeans (Por lo visto se puede utilizar versión 21, pero para que funcione correctamente utilice la versión 21) y buscar la carpeta donde se descomprimió el zip, dentro de esa carpeta netbeans automáticamente reconocerá el archivo como un proyecto y podrá iniciarlo en la clase Sistema.java

Instrucciones de instalación : Idealmente este programa está pensado para ejecutarse en APACHE NetBeans 23 y 21 con una versión del JDK en lo posible actualizada (23 o 22).
A la hora de ingresar al programa se necesitará del archivo Open Csv5.9.jar que se lo facilitaremos en el .rar del programa y en el GitHub de nuestro proyecto.

En caso de no reconocer las dependencias CSV realice estos pasos :
Se deberá Iniciar NetBeans para luego ir al apartado del proyecto, pulsaremos clic derecho en ‘SistemaProyecto’ e iremos a properties, una vez dentro en la categoría de libraries deberemos agregar un nuevo archivo .jar (Open Csv5.9) como dependencia.



