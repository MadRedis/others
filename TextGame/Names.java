import java.util.Random;

public class Names
{
    Random generator = new Random();
    
    public Names(){
    }
    public String getName(){
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";
        StringBuilder sb = new StringBuilder();
        String iName = "";
        int count = 0;
        int nLength = generator.nextInt(8)+2;
        
        for(int i = 0; i < nLength; i++) {
            int position = generator.nextInt(26);
            String letter = characters.substring(position, position+1);
            if(i == 0){
                letter = letter.toUpperCase();
            }
            sb.append(letter);
            iName = sb.toString();
        }
        for(int j = 0; j < nLength; j++){
            String ch = sb.substring(j, j+1);
            if(!vowels.contains(ch)){
                count++;
                if(count >= 2){
                    int ran = generator.nextInt(3);
                    if(ran == 1 || ran == 2){
                        int position1 = generator.nextInt(6);
                        String ch1 = vowels.substring(position1, position1+1);
                        iName = iName.replace(ch, ch1);
                    }
                }
            }
            else{
                count = 0;
            }
        }
        return iName;
    }
}
