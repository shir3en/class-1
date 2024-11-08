class Parent{
    int age,id;
    String name;
    void naming(String name){
        System.out.println("name:"+name);
    }
}
class Child extends Parent{
    void ageN(int age){

   
    System.out.println("age if student is "+age);
    
}
}
class Main{
    public static void main(String args[]){
    Child s=new Child();
    s.naming("aashish");
    s.ageN(14);
}
}

