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

* As a stretch goal
  * give /ADMIN access to /users
    * add end point /users/add to add a new user
    * add end point /users/delete/{id} to delete a user based off of id
    * add end point /users/viewall to show all the users
    * add end point /users/view/{id} to show a user based off of if
  
  
  
