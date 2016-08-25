import java.util.Random;
import java.util.*;

public class Character
{
    HashMap stats = new HashMap();
    String name = "";
    
    int hp = 0;
    int minDamage = 0;
    int maxDamage = 0;
    int level = 0;
    int exp = 0;
    
    public Character(){
        name = "";
        hp = 0;
        minDamage = 0;
        maxDamage = 0;
        level = 0;
        exp = 0;
    }
    
    public void charCreate(){
        Names nameGen = new Names();
        name = nameGen.getName();
        hp = (int)(Math.random() * 8 + 2);
        minDamage = 1;
        maxDamage = (int)(Math.random() * 4 + 2);
        level = 1;
        exp = 0;
        
    }
    
    /*public String getName(){
        return "Name: " + name;
    }
    public String getStats(){
        String hp1 = "hp: " + hp + "\n" + "minDamage: " + minDamage;
        return hp1;
    }*/
}
