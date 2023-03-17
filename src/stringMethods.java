public class stringMethods {

    public static void main(String[] args){

        String name = "super mario";
        
        System.out.println("Name: " + name);

        // string method, use variable dot(.) will bring up many string methods
        System.out.println("Uppercase name :" + name.toUpperCase());
        System.out.println("Lowercase name :" + name.toLowerCase());
        System.out.println("First cahr :" + name.toUpperCase().charAt(0));

        // substring(4): copies the string from the 4th element onwards
        System.out.println("First cahr :" + name.substring(4).toUpperCase());
        System.out.println("First cahr :" + name.substring(0,1).toUpperCase());



    }
    
}
