/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Iterator;


//import java.io.FileWriter;
//import java.io.IOException;
/**
 *
 * @author litem
 */
public class jsonOps {
     public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "0S");
        obj.put("age", new Integer(60));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

//        try (FileWriter file = new FileWriter("f:\\test.json")) {
//
//            file.write(obj.toJSONString());
//            file.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.print(obj);
        
        JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            long age = (Integer) jsonObject.get("age");
            System.out.println(age);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

    }
}
