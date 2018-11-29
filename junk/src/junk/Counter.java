package junk;


public class Counter{
 
  private static int count=0;

 private int nonStaticcount=0;
 
  public void incrementCounter(){
 
  count++;
 
  nonStaticcount++;
 
  }

 
  public int getCount(){
 
 return count;
 
 }
 
 public int getNonStaticcount(){
 
 return nonStaticcount;
 
 }
 


 public static void main(String args[]){

 
  Counter countObj1 = new Counter();

 Counter countObj2 = new Counter();
 
  countObj1.incrementCounter();
  System.out.println("Static count for Obj1: "+countObj1.getCount());
  
  System.out.println("NonStatic count for Obj1: "+countObj1.getNonStaticcount());
 
  countObj2.incrementCounter();
 
System.out.println("Static count for Obj1: "+countObj1.getCount());
  
  System.out.println("NonStatic count for Obj1: "+countObj1.getNonStaticcount());
 
  countObj2.incrementCounter();

  System.out.println("Static count for Obj2: "+countObj2.getCount());
 
  System.out.println("NonStatic count for Obj2: "+countObj2.getNonStaticcount());

}
}