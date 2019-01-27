# Week2LabMocking
A java project to show unit test, stub and mocking with mockito

Objectives:

we want to build a HR software. 

Our team has been assigned the following tasks:

1) Given a employee's full name, we want to capitalize the name (Independent implementation). 
We don't have to depend on anyone.

2) How many employees are from Edmonton? 
(So there is an online service that returns a list of all employees' addresses! We need to implement a method that checks
for Edmonton, and returns the list. But what if it takes too much time to return results by the service? 
Everytime we run our test suite, it will take a lot of time to execute because of the service bottleneck. 

3) How many emplyees have salary > 50K (Another team is developing a service that returns all the salary list, 
but they are not done yet). How can we filter the salary if that service from other team is not completed yet?


For mockito:

Window > Preferences > Java > Editor > Content Assist > Favorites
org.junit.Assert // this is done. 

org.mockito.BDDMockito
org.mockito.Mockito
org.hamcrest.Matchers
org.hamcrest.CoreMatchers
