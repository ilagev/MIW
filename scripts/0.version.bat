@echo off
set workspace=C:\Users\ivan\entorno_trabajo_MIW\workspace\spai0
::set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_60\bin;C:\Users\ivan\entorno_trabajo_MIW\software\apache-maven-3.3.3\bin
::set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
::set M2_HOME=C:\Users\ivan\entorno_trabajo_MIW\software\apache-maven-3.3.3
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn --version =======================================================
echo .
call mvn --version
call mvn clean package -Denvironment.type=preproduction
pause
::Se queda la consola abierta para realizar comandos en línea
::cmd /k
