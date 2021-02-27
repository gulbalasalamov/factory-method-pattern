## Factory Method Pattern
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. That's the objects are still created via the new operator, but it’s being called from within the factory method, so the factory method encapsulates object craetion. Objects returned by a factory method are often referred to as products.


## Design and Data Structures
In line with guides introduced in Head First Object Oriented Design Analysis & Design book, I aim to create tried-and-true design pattern and principles.
The structure tends to reduce duplicate codes, help objects couple loosely, and make code open for extention but closed for modification.
Do also note that some data structures may not yet totally draw from more advanved solutions introduced in newer Java versions.

## Demo App
The demo algorithm app follows Factory Method pattern. It takes input and encrypt/decrpt it using Caesar cypher and Unicode table. The program works with the command line, using it for passing the mode, the key and the string. Processsed text can either be provided locally in text file (.txt) or passed in String format. Result is stored either in local file or default print. Example input & output : 

java Main -mode enc -key 5 -data "Welcome to Gulbala!" -alg unicode 

\jqhtrj%yt%Lzqgfqf&

java Main -key 5 -alg shift -data "Bjqhtrj!" -mode dec 

Welcome!


<img src="https://github.com/gulbalasalamov/factory-method-pattern/blob/main/FactoryPatternDemoGIF.gif" alt="Algorithm App gif" title="Inventory Management App gif" width="900"/>


## UML Class Diagram

![Intro Page](https://github.com/gulbalasalamov/factory-method-pattern/blob/main/FactoryPatternUMLClassDiagram.png)

# Contributing
Pull requests are welcomed. For major changes, please open an issue first to discuss what you would like to change. Thanks!

Happy Coding!!!

## Copyright
© Gulbala Salamov
