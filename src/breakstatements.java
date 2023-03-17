public class breakstatements {
    
    public static void main(String[] args){

        for(int i = 0; i < 12; i++){

            if(i == 10){
                System.out.println("Want to break out of for loop");
                break;
            } else{
                System.out.println("the iteration we are on is" + i);
            }
        }
    }
}

