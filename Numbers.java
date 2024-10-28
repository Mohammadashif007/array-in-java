public class Numbers {
    void displayText(){
        System.out.println("Everything is ok");
    }
    public static void main(String[] args) {
        int [] newNumber = {11, 22, 33, 44, 55};
        Numbers func = new Numbers();
        for(int i = 0; i<newNumber.length; i++){
            newNumber[2] = 199;

            System.out.println("Number is : "+ newNumber[i]);
            func.displayText();

        }
    }
}
