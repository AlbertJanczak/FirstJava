public class SimpleCalculatorProgram {

    public static void main(String[] args) {
        int a=UserInputHelper.getNumberFromUser("a");
        int b=UserInputHelper.getNumberFromUser("b");

        String action=UserInputHelper.getActionFromUser();


        switch(action){
            case "dodawanie":
                System.out.println(Calculator.add(a,b));
                break;
            case "odejmowanie":
                System.out.println(Calculator.subtract(a,b));
                break;
            case "mnozenie":
                System.out.println(Calculator.multiply(a,b));
                break;
            case "dzielenie":
                System.out.println(Calculator.divide(a,b));
                break;
            default:
                System.out.println("nie znam komendy");









        }
    }
}
