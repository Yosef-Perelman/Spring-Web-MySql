# Spring-Web-MySql

Welcome!
Explanations about this project and running instructions:

This is a project I did to exercise my theoretical knowledge in the following technologies: Spring, MySql, Docker and AWS.
The application is a website for assistance in the job search process. It is written in Java and built in MVC architecture.
(This project has a docker image at https://hub.docker.com/repository/docker/yosefp/spring-app-mysql)

Running instructions:
1. Make sure that 'Docker' exists on the machine you are running on (In Windows write 'docker --version').
2. Run the command 'docker pull mysql' to download MySql docker image.
3. Run the command 'docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:latest' to create MySql container.
4. Open the bash of the sql server with the command 'docker exec -it mysql-db bash'.
5. Log in as root-user to the server with the command 'mysql -u root -p'. Now you will be asked to enter a password - write 'root'.
6. Now execute the following three commands to create a new DB, create a new user and give him permissions:
   - create database db_example;
   - create user 'springuser'@'%' identified by 'ThePassword';
   - grant all on db_example.* to 'springuser'@'%';
7. Make sure you exited the MySql-server command line.
8. Run the command 'docker pull yosefp/spring-app-mysql:latest' to download this project docker image.
9. Run the command 'docker run --name spring-app-mysql --link mysql-db:mysql -p 8080:8080 -e MYSQL_HOST=mysql-db yosefp/spring-app-mysql'.
10. Now in the local host, in port 8080 you can enter to the website.
