package Task10_02;

public class Cat extends Animal{
    @CatAnno(name = "Bob")
    public String name;
    @CatMethodAnno
    @Override
    public void method(){
        System.out.println("cat method");
    }
}
