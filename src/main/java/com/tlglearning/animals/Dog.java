package com.tlglearning.animals;

public class Dog extends Wolf {

  //Override of inherited Wolf class
  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  //Methods
  public static void whoAmI() {
    System.out.println("I am a dog!");
  }

  public void rollOver() {
    System.out.println("I am rolling over! I'm the best dog!");
  }

}
