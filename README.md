# PL-PO
## Práctica Obligatoria - Procesadores del Lenguaje
### Grado en Ingeniería Informática - URJC - 2016

Para "compilar" los archivos .flex y .cup ejecutar desde el directorio src/main lo siguiente:

````
jflex -d java jflex/spec.jflex && cup -destdir java -parser Parser cup/spec.cup
```

Se debe tenre inatalado jflex y cup como ejecutables del sistema, en caso contrario, sustituir la llamada a los ejecutables por sus correspondientes .jar
