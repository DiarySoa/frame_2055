cd .\build\web\WEB-INF\classes
jar cf Front.jar ./etu2055
copy "C:\Users\ITU\Documents\NetBeansProjects\FrameW\build\web\WEB-INF\classes\Front.jar" "C:\Users\ITU\Documents\NetBeansProjects\Test\web\WEB-INF\lib"
copy "C:\Users\ITU\Documents\NetBeansProjects\FrameW\build\web\WEB-INF\classes\Front.jar" "C:\Users\ITU\Documents\NetBeansProjects\Test\build\web\WEB-INF\lib"

cd "C:\Users\ITU\Documents\NetBeansProjects\Test\build\web"
jar cf Frame.war .

copy "C:\Users\ITU\Documents\NetBeansProjects\Test\build\web\Frame.war" "C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.27\webapps"
