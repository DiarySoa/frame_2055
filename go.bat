@echo off

set "FRAMEWORK_DIR=D:/Framework/essaie2/frame_2055/framework"
set "TEST_FRAMEWORK_DIR=D:/Framework/essaie2/frame_2055/test-framework"
set "TEMPORARY_DIR=D:/Framework/essaie2/frame_2055/temporary"
set "TOMCAT_DIR=C:/Program Files/Apache Software Foundation/Tomcat 9.0_Tomcat9.0"



cd "%FRAMEWORK_DIR%"

javac -parameters -d . *.java

jar cf framework.jar *

cd "%TEMPORARY_DIR%"

mkdir "WEB-INF"
mkdir "WEB-INF\classes"
mkdir "WEB-INF\lib"

copy /y "%FRAMEWORK_DIR%\framework.jar" "WEB-INF\lib"

xcopy /s /e /y "%TEST_FRAMEWORK_DIR%\WEB-INF\classes" "WEB-INF\classes"

copy /y "%TEST_FRAMEWORK_DIR%\WEB-INF\lib\*" "WEB-INF\lib"

copy /y "%TEST_FRAMEWORK_DIR%\WEB-INF\web.xml" "WEB-INF"

cd "%TEST_FRAMEWORK_DIR%"

for %%F in (*.jsp) do (
    copy /y "%%F" "%TEMPORARY_DIR%"
)

cd "%TEMPORARY_DIR%\WEB-INF\classes"

javac -parameters -cp "../lib\servlet-api.jar;../lib/framework.jar" -d . *.java

cd ../..

jar cf "frameworkTest.war" *


copy /y "frameworkTest.war" "%TOMCAT_DIR%/webapps"

echo "Done."
