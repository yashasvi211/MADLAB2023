class c2 extends m2 {
     
    void show()
    {
        System.out.println("Hello JUET");
    }
}
  
class m2 {
    void show()
    {
        System.out.println("Hello World");
    }
}
  
 
class Main 
{
    public static void main(String[] args)
    {
 
        m2 o1=new m2();
        c2 o2=new c2();
        o1.show();
        o2.show();
    }
}