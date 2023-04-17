package Util;

import Contact.Contacts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String DATE_FILE="data.txt";

    public static List<Contacts> readDate(String numb){
        List<Contacts> result=new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader(DATE_FILE))){
            String line=reader.readLine();
            String flag=

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addDate(Contacts contacts){
        List<Contacts> result=new ArrayList<>();
        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(DATE_FILE,true))){
            bufferedWriter.write(contacts.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
