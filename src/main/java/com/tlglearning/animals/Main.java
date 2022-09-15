package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {    //List are ordered collections
    List<Wolf> wolves = new ArrayList<>();    //List array type named 'wolves' initializes a new instance.
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);  //Shuffles the Array List wolves. Otherwise, it prints in order
    //For-each loop
    for (Wolf w : wolves) {       //Read as "for each Wolf w in wolves". Reference Type : Instance Type
      System.out.println();       //Will print a blank line
      System.out.println(w.getClass().getName()); //This will tell me the instance type
      w.hunt();
      w.vocalize();
      //Can't invoke rollerOver on wolf bc it only exists in Dog class.
      if (w instanceof Dog) {                  //can also be written
        ((Dog)w).rollOver();                   //Dog d= (Dog) w;
      }                                        //d.rollover();
      //Demonstration purposes only. Expand to see.
//      if (w instanceof Dog) {     //No need to write in this manner bc static methods don't utilize polymorphism
//        ((Dog) w).whoAmI();       //This is object type cast operation and has lower priority than the '.'
//        } else {                  //until you add the parenthesis around (Dog) and ((Dog) w).
//        Wolf.whoAmI();
//      }
    }
  }

}
