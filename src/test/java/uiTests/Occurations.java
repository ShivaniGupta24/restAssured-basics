package uiTests;

import java.util.HashMap;
import java.util.Map;

public class Occurations {

  public static void main(String[] args) {
    //
      String str = "My name is shivani".replaceAll(" ", "");
      char arr[] = str.toCharArray();
      Map<String, Integer> map = new HashMap<>();
      for(int index=0;index<arr.length;index++){
          map.put(""+arr[index], 1);
      }
      System.out.println("Map is"+map);
      for(int index=0;index<arr.length;index++){
          int n = map.get(arr[index]);
          if(n>1){
              map.put(""+arr[index], n+1);
          }
      }

  }
}
