public class StringHelper {
    public String Firts2Letters(String word){
        if(word.length()<=2){
            return word.replaceAll("A","");
        }
        String first2Caracters = word.substring(0,2);
        String second2Caracters = word.substring(2);
        return first2Caracters.replaceAll("A","")+second2Caracters;
    }
    public boolean first2AndLast2Caracters(String word){
        if(word.length()<=1){
            return false;
        }
        if(word.length()==2){
            return true;
        }
        String first2Caracters = word.substring(0,2);
        String lasCaracters = word.substring(word.length()-2);
        return first2Caracters.equals(lasCaracters);
    }

}
