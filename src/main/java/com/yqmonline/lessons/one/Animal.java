/** Created By AustinYQM **/
package com.yqmonline.lessons.one;

public class Animal {
  private int age;
  private final String name;

  public Animal(int age, String name) {
    this.age = age;
    this.name = name;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (null == other) return false;
    if (!(other instanceof Animal)) return false;
    Animal typecast = (Animal) other;

    return this.getName().equalsIgnoreCase(typecast.getName());
  }

  //  @Override
  //  public String toString() {
  //    return String.format("Age: %s, Name: %s", age, name);
  //  }
}
