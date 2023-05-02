public class LoopsJava{
    public static void main(String args[]){
        // FOR LOOP
        for(int i = 1; i <= 10; i++){
            System.out.print("Transcation Number : "+i+"\n");
        }
        
        // WHILE LOOP
        int number = 2;
        while(number<=10){
            System.out.print("Transcation Number : "+number+"\n");
            number++;
        }
        
        // DO WHILE LOOP
        int number = 6;
        do{
            System.out.print("Transcation Number : "+number+"\n");
            number++;
        }while(number<=10);
    }
}
