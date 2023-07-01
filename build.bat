@echo off

cd "./framework"

javac -d . *.java

jar cf framework.jar *

cd "../"

copy "framework\\framework.jar" "test-framework/WEB-INF\\lib\\"

cd "test-framework/WEB-INF\\classes\\"

javac -cp D:\Framework\frame_2055\test-framework\WEB-INF\lib\framework.jar -d D:\Framework\frame_2055\test-framework\WEB-INF\classes *.java

cd "..\..\..\test-framework"

jar cf frameworkTest.war .

IF EXIST "C:\Program Files\Apache Software Foundation\Tomcat 8.5_Tomcat8.5\webapps\frameworkTestwar" (
  DEL "C:\Program Files\Apache Software Foundation\Tomcat 8.5_Tomcat8.5\webapps\frameworkTest.war"
)

copy "frameworkTest.war" "C:/Program Files/Apache Software Foundation/Tomcat 8.5_Tomcat8.5/webapps/"