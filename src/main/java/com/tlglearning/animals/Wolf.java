package com.tlglearning.animals;

public class Wolf {

  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData(); //Declaration with assignment is a field

  //Static initialization code that will be executed when the class
  static {
    System.out.println("Wolf static initialization block");
  }

  //This is an instance initialization block
  {
    System.out.println("Wolf instance initialization block");
  }

  //Constructor. Every constructor has exactly 1 super() whether explicit or implicit in bytecode by the compiler.
  //So if super() is empty you do not need to add it.
  public Wolf() {
    System.out.println("Wolf constructor");
  }


  private static int initializeValue() {
    System.out.println("Wolf.intializeValue");
    return -1;
  }

  private int initializeData() {
    System.out.println("Wolf.initializeData");
    return -1;
  }

  public void vocalize() {

    System.out.println("Howl like a wolf!");
  }


  public void hunt() {
    System.out.println("Hunt in packs for live prey");
  }

  public static void whoAmI() {
    System.out.println("I am a wolf");
  }


}
