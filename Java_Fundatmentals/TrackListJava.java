import java.util.HashMap;
import java.util.Set;

public class TrackListJava{

   public static void main(String[] srgs) {
       HashMap<String, String> songMap = new HashMap<String, String>();
       songMap.put("You need to calm down", "So oh-oh, oh-oh, oh-oh, oh-oh, oh-oh You need to calm down, you're being too loud");
       songMap.put("Love Story", "We were both young when I first saw you I close my eyes, and the flashback starts");
       songMap.put("Delicate", "This ain't for the best My reputation's never been worse");
       songMap.put("Style", "You got that James Dean daydream look in your eye"); 

       System.out.println(songMap.get("Love Story"));
       System.out.println("iterate ALl");
       Set<String> keys = songMap.keySet();
       for (String key : keys){
           System.out.println(key+" : "+songMap.get(key));
       }
       
   }
}