package structuralPattern.ProxyPattern;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println("display file:"+fileName);
    }

    public void loadFromDisk(){
        System.out.println("load form disk:"+fileName);
    }
}
