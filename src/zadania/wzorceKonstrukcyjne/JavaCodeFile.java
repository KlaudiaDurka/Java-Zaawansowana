package zadania.wzorceKonstrukcyjne;

public class JavaCodeFile implements Cloneable {

    private String licence;
    private String code;
    private String filename;
    private String fileExtension;

    public JavaCodeFile(String licence, String code) {
        this.licence = licence;
        this.code = code;
    }

    public JavaCodeFile(String licence, String code, String filename, String fileExtension) {
        this(licence, code);
        this.filename = filename;
        this.fileExtension = fileExtension;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Override
    protected JavaCodeFile clone() throws CloneNotSupportedException {
        return (JavaCodeFile) super.clone();
    }
}
