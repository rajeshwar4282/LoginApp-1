From openjdk:8
copy ./target/Loginweb-0.0.1-SNAPSHOT.war Loginweb-0.0.1-SNAPSHOT.war
CMD ["java","-jar","Loginweb-0.0.1-SNAPSHOT.war"]