# shopping-api

Spring boot (RestfullAPI)

Technologies<br>
⦁ PostgreSQL Database <br>
⦁ Spring Web<br>
⦁ Spring Data JPA<br>
⦁ Spring Security<br>
⦁ JWT<br>
⦁ Postman(Testing)<br>
⦁ Build Tool (i.e. Maven) <br>

## Instructions To Run Backend
1- Just Extract The BACKEND Folder to STS(Spring Tool Suite) and run it as (Java Application) on port=8080.<br>
2- For Database You can Excute the sql file in your Sql Editor (it contain database creation statement) OR Just create the database(name=hrr,username=postgres,pass=adminadmin) Maunally And Run The Application And It will create the Tables With It Objects.<br>
3- Then You Can Test It Using Postman.<br>

== AppUser ==<br>
Login(POST:localhost:8080/api/v1/auth/login?userName=admin&password=admin)<br>
Login(POST:localhost:8080/api/v1/auth/login?userName=user&password=user)<br>

== Order ==<br>
Return all Orders (GET : localhost:8080/api/v1/getAllOrders)<br>
Return Order (GET : localhost:8080/api/v1/getOrderById) With Request Param <br>
Add Order (POST : localhost:8080/api/v1/addOrder) With Json Body <br>
Update Order (PUT : localhost:8080/api/v1/updateOrder) With Json Body <br>
Delete Order (DELETE : localhost:8080/api/v1/deleteOrder ) With Request Param <br>

== Product == <br>
Return all Products (GET : localhost:8080/api/v1/getAllProducts) <br>
Return Product (GET : localhost:8080/api/v1/getProductById) With Request Param <br>
Add Product (POST : localhost:8080/api/v1/"/addProduct") With Json Body <br>
Update Product (PUT : localhost:8080/api/v1/"/updateProduct") With Json Body <br>
Delete Product (DELETE : localhost:8080/api/v1/deleteProduct) With Request Param <br>
