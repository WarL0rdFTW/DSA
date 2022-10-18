public class occurence{

    public static void main(String args[]){

       String ans =  occ("minusplusminus");
      System.out.println(ans);

        
    }

    public static String occ(String input){
        String str = input.toLowerCase();
       
        String result = str.replace("plus", "+").replace("minus", "-");
        return result ;
    }
}