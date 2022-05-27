# Abstract Factory (Creational Patterns)


## Intent

Provide an interface for creating families of related or dependent objects without specifying their concrete classes

## Also Known As
Kit


## Applicability

Use the Abstract Factory pattern when:

* a system should be independent of how its products are created, composed, and represented.
* a system should be configured with one of multiple families of products.
* a family of related product objects are designed to be used together, and you need to enforce this constraint.
* you want to provide a class library of products, and you want to reveal just their interface, not their implementations.

## Participants


* AbstractFactory: declares an interface for operations that create abstract product objects.
* ConcreteFactory: implements the operations to create concrete product objects.
* AbstractProduct: declares an interface for type of product object.
* ConcreteProduct: 
  * defines a product object to be created by the corresponding concrete factory.
  * implements the AbstractProduct interface.
* Client: uses only interfaces declares by **AbstractFactory** and **AbstractProduct** classes.