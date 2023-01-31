package json;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Main {
    public static void main(String[] args){
        try{
            List<Data> list=new ArrayList<>();
            JSONParser parser=new JSONParser();
            JSONArray array=new JSONArray();
        FileReader reader=new FileReader("E:\\workspace\\ZSGS\\Days\\src\\Day10\\jsonpojo\\test.json");
        
        JSONObject object=(JSONObject)parser.parse(reader);
        array=(JSONArray)object.get("list");
        for(int i=0;i<array.size();i++){
            JSONObject on=(JSONObject)array.get(i);
            String nickname=(String)on.get("nickname");
            String zuid=(String)on.get("zuid");
            String firstname=(String)on.get("firstname");
            long lmtime=(long)on.get("lmtime");
            long ctime=(long)on.get("ctime");
            String id=(String)on.get("id");
            JSONArray ph=(JSONArray)on.get("phone_nos");
            String phs[]=new String[ph.size()];
            for(int j=0;j<ph.size();j++){
                phs[j]=(String)ph.get(j);
            }
            list.add(new Data(phs,nickname,zuid,firstname,lmtime,ctime,id));
        }
        for(Data s:list){
            System.out.println(s.getnickname());
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}