class run
{
  void display()
  {
    
    System.out.print("hi");
   }
 }
class time extends run
{
 void display()
  {
     super.display();
    System.out.print("am");
   }
}
class poly extends time
{
  void display()
  
  {
    super.display();
    System.out.print("java");
   }
}
class m
{
 public static void main(String v[])
 {
   run r;
   time t=new time();
   poly p=new poly();
   r=p;
   p.display();s
}
}