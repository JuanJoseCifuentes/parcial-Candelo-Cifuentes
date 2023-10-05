# Punto 5.

Comando para crear imagen de docker del proyecto: 
- docker build -t parcial-Candelo-Cifuentes:1.0.0

**Nota: Recuerde que debe actualizar la versión cada vez a fin de no sobreescribir la versión anterior.**

# Punto 6.
Para correr el aplicativo desde Docker, primero es necesario levantar una base de datos MySQL. Para esto, también utilizaremos Docker.
Para cumplir con las credenciales requeridas y levantar un contenedor de MySQL, utilice el siguiente comando:
- docker run -d -p 8090:3306 -e MYSQL_DATABASE=yms -e MYSQL_USER=yms_user -e MYSQL_PASSWORD=yms_clave -e MYSQL_ROOT_PASSWORD=1234 mysql

A continuación, levante el contenedor del aplicativo con el comando
- docker run -d -p 8080:8080 parcial-Candelo-Cifuentes