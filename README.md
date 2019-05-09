# java-safezoos

* Implement OAuth2 security with different security roles
* Implement Many-to-Many and One-to-Many relations with auditing fields


## Introduction

We will continue working on our zoo application, adding security to our zoos.

## Instructions
Using your java-zoos as a starting point (https://github.com/LambdaSchool/java-zoos.git), add OAuth2 security to the application. 

* ROLE ADMIN should be allowed to access /admin /animals /zoos

* ROLE ZOODATA should be allowed to access /zoos

* ROLE ANIMALDATA should be allowed to access /animals

* ROLE MGR (manager) should be allowed access /actuator /animals /zoos.

* Everyone (authenticated or not) should be allowd to access the swagger ui!

Note: The included seeddata.java class is meant to be used as a guide on how to set up your seeddata class. It is NOT meant to be used as is! 

* As a stretch goal
  * add end point /users/add to add a new user
  * add end point /users/delete/{id} to delete a user based off of id
  * add end point /users/viewall to show all the users
  * add end point /users/view/{id} to show a user based off of if
  
  * give /ADMIN access to /users
  
