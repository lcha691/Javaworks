public class methodsOrFunctions {
    
    // this is the 'main' method
    public static void main(String[] args){
        //int a = 5;
        //int b = 10;
        //System.out.println(a * b);

        // but if we wanted to multiply different numbers together we'd have to manually write sysout many time, annoying
        // Solution: Methods/ fucntions

        // call methods in the 'main' method
        welcome();

        multiply(3,4);
        multiply(8,7);

        divide(8, 4);
        divide(100, 20);
    }

    // this is a method
    public static void welcome(){
        System.out.println("Welcome to our calculator!");
    }

    // this is another method
    public static void multiply( int a, int b){
        System.out.println(a * b);

    }

    // this is a third method
    public static void divide(int a, int b){
        System.out.println(a/b);
    }
}
