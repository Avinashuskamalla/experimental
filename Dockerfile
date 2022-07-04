FROM fabric8/java-centos-openjdk11-jre
ADD target/*.jar /home/hello-spanner.jar
CMD ["java", "-jar", "/home/hello-spanner.jar"]