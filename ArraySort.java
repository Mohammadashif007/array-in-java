public class ArraySort {
    String[] names = {"Anik", "Ashif", "Rony", "java"};

    public static void main(String[] args) {
        ArraySort name = new ArraySort();
        for(int i = 0; i< name.names.length; i++){
            name.names[2] = "Roy";
            System.out.println(name.names[i]);
        }
    }
}
