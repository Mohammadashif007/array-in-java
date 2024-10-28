public class CarsArray {
    String[] carName = {"Ferrari", "Mustang", "BMW", "Mercedes", "Audi"};
    public static void main(String[] args) {
        CarsArray name = new CarsArray();
        System.out.println(name.carName.length);
        for(int i = 0; i< name.carName.length; i++){
            System.out.println(name.carName[i]);
        }
    }
}
