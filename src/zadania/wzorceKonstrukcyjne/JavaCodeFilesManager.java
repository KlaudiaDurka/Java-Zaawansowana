package zadania.wzorceKonstrukcyjne;

public class JavaCodeFilesManager {

    private static final JavaCodeFile BASE_FILE = new JavaCodeFile("SDA", "Java");

    public JavaCodeFile create(String fileName, String fileExtenion) throws CloneNotSupportedException {

        JavaCodeFile clonedObject = BASE_FILE.clone();
        clonedObject.setFilename(fileName);
        clonedObject.setFileExtension(fileExtenion);
        return clonedObject;
    }
}
