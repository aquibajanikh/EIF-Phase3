public class DecisionMaking{
    public static void main(String args[]){
        // Ternary Operator
        double balance = 1000.0;
        boolean activeStatus = true;
        String result;
        
        // result = activeStatus==true && balance<3000.0 ? "Less balance" : "Sufficient Balance";
        
        if(activeStatus==true && balance<3000.0){
            result = "Less balance";
        } else {
            result = "Sufficient Balance";
        }
        
        System.out.println(result);
    }
}
