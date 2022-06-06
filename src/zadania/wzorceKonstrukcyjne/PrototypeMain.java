package zadania.wzorceKonstrukcyjne;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        JavaCodeFilesManager manager = new JavaCodeFilesManager();

        JavaCodeFile javaCodeFile1 = manager.create("licencja", "txt");
        JavaCodeFile javaCodeFile2 = manager.create("licencja 2 ", "xlsx");

    }
}
