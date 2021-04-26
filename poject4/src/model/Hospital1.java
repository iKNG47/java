package model;

import java.util.ArrayList;


public class Hospital1 {
    private static ArrayList<Object> docList = new ArrayList<Object>();

    public static ArrayList<Object> getDocList() {
        return docList;
    }

    public static void Exit(){
      System.exit(0);
    }
    public  void addToList(Patient patient, ArrayList docList){
        docList.add(patient);
    }
    public void getList(){
        for (Object n:docList ) {
            System.out.println(n);
        }
    }

}
