import java.util.Random;
import java.util.*;

public class Character1
{
    HashMap stats = new HashMap();
    String name = "";
    int hp = 0;
    int minDamage = 0;
    int maxDamage = 0;
    int level = 0;
    int exp = 0;
    
    public Character1(){
        stats.put("Name", name);
        stats.put("Hp", hp);
        stats.put("Damage0", minDamage);
        stats.put("Damage1", maxDamage);
        stats.put("Level", level);
        stats.put("Exp", exp);

    }
    
    public void charCreate(){
        Names nameGen = new Names();
        name = nameGen.getName();
        stats.put("Name", name);
    }
    
    public String getName(){
        String name1 = stats.get("Name").toString();
        return "Name: " + name1;
    }
}
