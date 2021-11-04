public class TestTemplateMethode{
    public static void main(String args[]){
        ClasseTemplate impl1 = new Implementation1();
        ClasseTemplate impl2 = new Implementation2();
        impl1.templateMethode();
        impl2.templateMethode();
    }
}