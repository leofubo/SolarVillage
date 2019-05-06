# Permit Application rest services
## run application
`cd permit-service`  
`mvn clean package`  
`java -jar target/permit-service-1.0.0.jar`  
## test rest APIs
### electric permit
#### new application
`curl --request POST --url http://localhost:8080/permit/electric --header 'content-type: application/json' --data xyz`
#### get application status
`curl --request GET --url http://localhost:8080/permit/electric/3`
#### rescind application
`curl --request DELETE --url http://localhost:8080/permit/electric/3`
### structural permit
#### new application
`curl --request POST --url http://localhost:8080/permit/structural --header 'content-type: application/json' --data xyz`
#### get application status
`curl --request GET --url http://localhost:8080/permit/structural/3`
#### rescind application
`curl --request DELETE --url http://localhost:8080/permit/structural/3`
