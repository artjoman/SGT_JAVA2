package lesson9;

public class Utilities {

    public static class Delete {
        public void delete(String filename) {
            System.out.println("delete");
        }
    }

    public static class Create {
        public static void createFile(){
            System.out.println("Created file");
        }
    }
}

class AnotherMainApplication {
    public static void main(String[] args) {
        Utilities.Create.createFile();
        Math.random();
    }
}