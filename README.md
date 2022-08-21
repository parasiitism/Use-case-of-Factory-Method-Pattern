# Use-case-of-Factory-Method-Pattern



The Factory Method Pattern is also called as the Virtual Constructor, and it belongs to the Creational Design Pattern. The main purpose of this pattern is to create an abstract class (a.k.a factory) for creating objects. Because of that, the object instantiation is done by its subclasses. Also, you can use an interface as the factory, instead of an abstract class. So, if you use interface as the factory, its subclasses must implement their own factory methods for object instantiation.

In my previous article, I have explained about Singleton Design Pattern with some practical examples. If you read that article carefully, you might remember that I have highlighted a difference between these two patterns. It was, “If you want to accept any arguments when you create the instance, you should go with Factory design pattern instead of Singleton.”

So, when you use Factory Method Pattern you have to always use parameters to determine which instance you want to get. However, you can still use no-argument constructor if it is necessary.

Another difference is, the Singleton Pattern ensures that you always get back the same instance of whatever type you are retrieving, but the Factory Method Pattern usually gives you a different instance of each type.

Use case of Factory Method Pattern
In this chapter, I will explain how to apply Factory Method Pattern with a real-world practical example using Java.

Assume there is a restaurant that sells fast-food. In this restaurant, they have several types of fast-food such as, meals, beverages, salads, and deserts. However, if a customer wants, they can buy those as combos (collection of different food items). The combos come with three different categories named as, Lite-Combo, Family-Combo, and Mega-Combo. Each combo contains different types of foods based on the budget of that combo.


Image: Combo Types
The following illustrate will give you a general overview of this implementation


Image: General overview of the implementation
Let’s see how we can implement this use case, step by step.

Step 01

In the first step I have created an abstract class named as, “RegularOders”. This class contain an abstract method named as, “printOrder”. As I mentioned above, the restaurant has several type of food items. So, each of these food item should have a separate class by their name and must implement the “printOrder” method as a result of extending “RegularOder” class. The reason for extending “RegularOder” class by these 4 classes, because each of them are regular food item that can order separately.



Salads and Desserts also have their own classes, as above two classes.

Step 02

In this step I have created the abstract class named as “Combos”, that must be inherited by 3 other subclasses named as, Lite-Combo, Family-Combo, and Mega-Combo. As you can see this abstract class also contain an abstract method named as “comboDetails.” So, all these 3 classes should implement that method in their class.




As you can see, all 3 classes implemented “comboDetails” method within them. That method is responsible for adding all the food items that belongs to each respective combo by creating their object. Therefore, if the restaurant wants to add a new combo into their menu, only thing we have to do is create a class for that particular combo and extend the “Combos” class.

Step 03

In this step I have implement the “ComboCreator” class. This class responsible for return the relevant package based on the “ComboCode.” To hold the codes, I have implemented an Enum for that.


Step 04

As the final step, I have implemented the “HotMealApplication” class. So, in here you can pass the Combo code that related to the combo you want, to the instance of “Combos” class. And with the help on “printOrder” method, it will give you the detail of combos that you bought.
![image](https://user-images.githubusercontent.com/86511874/185790424-faa67c28-08fd-4688-a2b8-b2e2bd1addaf.png)


Image: Result of the Factory Method Pattern implementation
