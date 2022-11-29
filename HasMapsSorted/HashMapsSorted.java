import java.util.*;
class Student implements Comparable{
  int number;
  String name;
  public Student(int number, String name){
    this.number = number;
    this.name = name;
  }
  public String toString(){
    return number + "  " + name;
  }

  public int compareTo(Object O){
    Student s = (Student)O;
    return this.name.compareTo(s.name);
  }

}
class HashMapsSorted {
  public static void main(String[] args) {
    SortedMap<Student,Integer> sm = new TreeMap<>();
    Student s1 = new Student(101,"Amit");
    Student s2 = new Student(102,"Akshay");
    Student s3 = new Student(103,"Arjun");
    Student s4 = new Student(104,"Raja");

    sm.put(s1,20);
    sm.put(s2,21);
    sm.put(s3,22);
    sm.put(s4,23);

    System.out.println(sm);
    sm.put("karan",101);
    sm.put("Nikhl",102);
    sm.put("Ajay",103);
    sm.put("Alka",104);
    System.out.println(sm);

    // tailMap(start to end) Method..
    System.out.println("Tail Elements " + sm.tailMap("Nikhil"));
    // headMap(end to start)
    System.out.println("headMap " + sm.headMap("karan"));
  
    // firstKey(firstElement)
    System.out.println("first key " + sm.firstKey());
    // LastKey(lastKey)
    System.out.println("LastKey " + sm.lastKey());
  }
}
