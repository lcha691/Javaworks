public class jumpDemo {
    
    public static void main(String[] args){

        for(int i = 1; i<=10; i++){

            // continue, used the same way as return or break but is used for jumping past particular elements 
            // or doing something specific with them without breaking the loop
            if(i==7){
                System.out.println("skipping " + i);
                continue;
            }
            System.out.println("value = " + i);
        }
    }
}
