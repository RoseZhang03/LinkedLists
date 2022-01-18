# LinkedLists

This code was compiled in Dr. Java

The Node class creates the object Node, which represents a node in a LinkedList. A Node is created with two parameters, a String representing the flight number and an int representing the expected landing time of the plane. There are getter methods for both parameters, and a setter method for the arrivalTime parameter.

The Arrivals class constructs the Arrivals object, representing a LinkedList. I explore the usage of a LinkedList by creating LinkedList methods myself, creating methods to add a Node, delete a Node, and change the location of a Node within the LinkedList in the event of the arrivalTime changing. When adding a flight or changing its arrivalTime, a for loop is used to traverse each flight Node and compare the arrivalTime to determine the new location of the Node in the Arrivals LinkedList. There is also a toString method which can be used to print the information contained in each flight Node.

The ArrivalsTester class contains the main method that tests the methods in the Node class and the Arrivals class and displays changes by printing the information of all flight Nodes of the Arrivals LinkedList using the toString method in the Arrivals class.
