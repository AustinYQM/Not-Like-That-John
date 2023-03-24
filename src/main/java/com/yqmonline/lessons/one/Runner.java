/** Created By AustinYQM **/
package com.yqmonline.lessons.one;

public class Runner {
  public static void main(String[] args) {
    System.out.println("***** Lesson One *****");
    Animal marge = new Animal(11, "Marge");
    Dog jake = new Dog(9, "Jake", "brown");
    System.out.println("Print marge: " + marge);
    System.out.println("Print jake: " + jake);
  }
}
