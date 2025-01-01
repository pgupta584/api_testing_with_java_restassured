# Run Testng Tests via Maven TestNg
mvn clean test -Dtestng.suiteXmlFiles=testng.xml

# Run Only Maven 
mvn clean test

# Run with Volume mapping

## Start and Stop Container
# Stop container:
docker stop <container_name_or_id>

# Start container:
docker start <container_name_or_id>

# Restart container (stop and start in one command):
docker restart <container_name_or_id>

# Important Notes 
Reports will be created inside target folder so download it and then open in the browser for better view