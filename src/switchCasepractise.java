public class switchCasepractise {
    
    public static void main(String[] args){

        int day = 2;

        /*if(day ==0) {
            System.out.println("sunday");
        }else if (day ==1){
            System.out.println("monday");
        }else if (day ==1){
            System.out.println("tuesday");
        }else if (day ==1){
            System.out.println("wednesday");
        }else if (day ==1){
            System.out.println("thursday");
        }else if (day ==1){
            System.out.println("friday");
        }else if (day ==1){
            System.out.println("saturday");
        }*/

        // this is a super long process though
        // switchCase allows us to make this process more efficient

        switch(day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;

        }

    }
}
