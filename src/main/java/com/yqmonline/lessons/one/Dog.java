/** Created By AustinYQM **/
package com.yqmonline.lessons.one;

public class Dog extends Animal {
  private final String color;

  public Dog(int age, String name, String color) {
    super(age, name);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object other) {
    if (!super.equals(other)) return false;
    if (!(other instanceof Dog)) return false;

    Dog typecast = (Dog) other;
    return this.getColor().equalsIgnoreCase(typecast.getColor());
  }
}
