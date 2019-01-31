/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperationio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Teacher
 */
public class FileRead {
    public void readFromFile(){
        try{
            File file = new File("C:\\Users\\Teacher\\Desktop\\MAHB\\My.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fileReader.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
