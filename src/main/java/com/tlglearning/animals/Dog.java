package com.tlglearning.animals;

public class Dog extends Wolf {

  private static final int MY_CONSTANT = initializeValue(); 

  static {
    System.out.println("Dog initialization block");
  }

  //Declare and initialize a field. This is wrong location for example to compiler
  private int data = initializaData();

  //Instance initialization block
  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Second Dog initialization block");
  }

  //Constructor
  public Dog() {
    System.out.println("Dog constructor");
  }

  private static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }

  //Methods
  public static void whoAmI() {
    System.out.println("I am a dog!");
  }

  //Method. Normally behind constructor.
  private int initializaData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  //Override of inherited Wolf class
  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  public void rollOver() {
    System.out.println("I am rolling over! I'm the best dog!");
  }

}
