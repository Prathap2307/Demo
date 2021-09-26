package MapDemo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	   public static void main(String[] args)   
       {   
           ConcurrentHashMap h=new ConcurrentHashMap();   
           h.put(100,"Stark");   
           h.put(101,"Michale");   
           h.put(102,"Ani");   
           h.put(null,"Sofia");   
           System.out.println(h);   
       }   
}
