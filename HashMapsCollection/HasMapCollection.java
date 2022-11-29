import java.util.*;

class Student{
  int number;
  String name;

    public Student(int number, String name){
      this.number = number;
      this.name = name;
    }

    public String toString(){
      return number + "--> " + name;
    }

}

class HasMapsCollection{
  public static void main(String[] args) {
    Student s1 = new Student(101,"Karan");
    Student s2 = new Student(102,"Nikhil");
    Student s3 = new Student(103,"Abhay");
    Student s4 = new Student(104,"Pushpa");

    HashMap<Integer,Student> College = new <Integer,Student>HashMap();

    College.put(1,s1); // to add elements into HashMap to use put keyword
    College.put(2,s2);
    College.put(3,s3);


  for(int i = 0; i < College.size(); i++){
    Student s;
    s = College.get(i+1);
    System.out.println(s);
  }
// setkeys method
System.out.println(College.keySet()); // to get olny keys..
System.out.println(College.values()); // to get all elements into hashmaps

College.put(1,s4); // we can replace or update value using put as well. or add..
System.out.println(College);
College.put(1,s1);
// EntrySetkey below starts..
//Entry setMethod....HashMaps
Set<Map.Entry<Integer, Student>> entries_college = College.entrySet();
Iterator <Map.Entry<Integer, Student>> iter = entries_college.iterator();
while(iter.hasNext()){
  Map.Entry<Integer, Student> keyvalue = iter.next();
  Integer ikey = keyvalue.getKey();
  Student s = keyvalue.getValue();

  System.out.println(ikey + "--> " + s);
}

System.out.println("Is Empty " + College.isEmpty());

  }
}
