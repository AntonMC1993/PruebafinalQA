I. Proyecto de Pruebas Automatizadas con Selenium y Cucumber
**********************************************************

Antes de continuar con la lectura, considerar que este README contiene dos secciones. La primera consiste en el ejercicio de Prueba Automatizada con Selenium y Cucumber, y la segunda consiste en un ejercicio realizado con Postman.

Este proyecto tiene como objetivo realizar pruebas automatizadas en el sitio web del Banco Central de Chile utilizando Selenium y Cucumber.

Requisitos previos
*******************

1. Asegúrate de tener instalado lo siguiente antes de ejecutar el proyecto:

*Java JDK (versión 8 o superior)
*Maven
*Google Chrome
*Chromedriver (Asegúrate de que la versión de Chromedriver coincida con la versión de Chrome que tienes instalada)
*Configuración del proyecto

2. Clona este repositorio en tu máquina local.

3. Asegúrate de que el archivo chromedriver.exe esté ubicado en la siguiente ruta: C:\Users\<TU_USUARIO>\Desktop\PruebaFinalQA\Software\chromedriver.exe o actualiza la ruta en el archivo home.java en el método abro_el_navegador_Chrome().

4. Importa el proyecto a tu IDE (Eclipse, IntelliJ, etc.) como un proyecto Maven.

5. Asegúrate de que todas las dependencias de Maven se han descargado correctamente.

Estructura del proyecto
***********************
src/test/java: Contiene las clases de pruebas y definiciones de pasos de Cucumber.
src/test/resources/features: Contiene los archivos de características de Cucumber escritos en lenguaje Gherkin.

Ejecución de las pruebas
*************************
Para ejecutar las pruebas, puedes hacerlo a través de la línea de comandos o desde tu IDE. Puedes usar el siguiente comando para ejecutar las pruebas desde la línea de comandos:

mvn clean test

Información adicional
**********************
Para agregar nuevas pruebas, puedes crear archivos de características en el directorio src/test/resources/features y definir los pasos correspondientes en las clases de definiciones de pasos en src/test/java.

Puedes personalizar las URL y otras configuraciones en el archivo home.java y en las definiciones de pasos de Cucumber.

-----------------------------------SECCIÓN 2--------------------------------------------------------------------------------------------------------------

II. Pruebas Automatizadas sobre APIs
***************************************
Este proyecto tiene como objetivo realizar pruebas automatizadas en APIs utilizando Postman. Se ha exportado una colección llamada "API CMF" a un archivo JSON que contiene una serie de requests para validar diferentes aspectos de las respuestas de la API.

Requisitos previos
**********************
1. Asegúrate de tener instalado lo siguiente antes de ejecutar el proyecto:

Postman

2. Importar el proyecto desde el archivo JSON

3. Abre Postman.

4. En la barra lateral izquierda, haz clic en "Import" para importar la colección desde el archivo JSON.

5. Selecciona el archivo JSON exportado del proyecto.

6. La colección "API CMF" se importará con todas las variables y configuraciones.

Configuración del proyecto en Postman
**************************************
1. Abre la colección "API CMF" en Postman.

2. Asegúrate de que las variables de entorno estén configuradas:

-baseUrl: La URL base de la API, por ejemplo, https://api.cmfchile.cl/api-sbifv3/recursos_api

-apiKey: fa4f187950bb5820eebfc911674e8a40975974a7 Ó Tu API Key.

3. Asegúrate de que las solicitudes dentro de la colección utilicen estas variables de entorno para las URL.

Ejecución de las pruebas
*************************
1. Abre Postman.

2. Selecciona la colección "API CMF" en la barra lateral izquierda.

3. Haz clic en el botón "Run" para ejecutar la colección.

4. Las pruebas se ejecutarán automáticamente y se mostrarán los resultados.

Validaciones de las pruebas
*****************************
1. Request 1: "Dólar año anterior"
Validar que la respuesta se procese por debajo de 500 milisegundos.
Validar que la respuesta contenga un texto que diga "Dolares".
Validar que la respuesta contenga un dato para el 31 de agosto de 2022.

2. Request 2: "Euro día actual"
Validar que la respuesta contenga un encabezado "Content-Type" en el header.
Validar que la respuesta contenga un texto que diga "Euros".
Validar que la respuesta no contenga valores nulos en los campos Valor y Fecha.

Observaciones
**************
Asegúrate de que la URL base de la API y la API Key estén configuradas como variables de entorno en Postman.

Los resultados de las pruebas se mostrarán en Postman y podrás revisarlos detenidamente desde allí.

¡Disfruta realizando tus pruebas automatizadas en APIs con Postman! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en consultar.

                                -------------------------HAPPY TESTING!!!-----------------------------



