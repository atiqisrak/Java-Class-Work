
package fileoperationio;


public class FileOperationIO {

    
    public static void main(String[] args) {
        FileRead fr = new FileRead();
        fr.readFromFile();
        
        FileWrite fw = new FileWrite();
        fw.writeToFile();
        
        
        fr.readFromFile();
    }
    
}
