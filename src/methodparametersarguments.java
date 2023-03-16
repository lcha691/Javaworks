public class methodparametersarguments {
    
    //                  inside brackets are parameters)
    public static void main(String[] args){
        //printinfo("Sonic", 23);
        // sonic and 23 are the arguments

        //printinfo("Alex", 109);
        //printinfo("Mark", 45);

        int result1 = add(5,5);
        int result2 = add(9,3);
        int result3 = add(4,21);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
                        //(parameters are int x and int y)
    public static int add(int x, int y){
        return x + y;

    }

    //                              (method definition/parameters)
    public static void printinfo(String name, int age){
        System.out.println("This is " + name + ". Theyre " + age + " years old.");


    }
}
