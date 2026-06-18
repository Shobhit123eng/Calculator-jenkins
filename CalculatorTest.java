public class CalculatorTest {

    public static void main(String[] args){

        Calculator c=new Calculator();

        if(c.add(2,3)==5){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }
    }
}