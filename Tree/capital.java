public class capital {
    
    public static void main(String[] args) {
        String in = "THIS_IS_A_TEST";

        in = in.replaceAll("_", " ");
        in = in.toLowerCase();
        System.out.println(in);
        String ans = "";
        char[] ch = in.toCharArray();
        boolean spacefound = true;

        for(int i=0;i<ch.length;i++){
           if(Character.isLetter(ch[i])){
            if(spacefound){
                ch[i] = Character.toUpperCase(ch[i]);
                spacefound = false;
            }
            
           }
           else {
            spacefound = true;
           }
        }
        ans = String.valueOf(ch);
     System.out.println(ans);

     // create a string
    //  String message = "THIS_IS_A_TEST";
    //  message = message.replaceAll("_", " ");
    //  message = message.toLowerCase();
    //  // stores each characters to a char array
    //  char[] charArray = message.toCharArray();
    //  boolean foundSpace = true;
 
    //  for(int i = 0; i < charArray.length; i++) {
 
    //    // if the array element is a letter
    //    if(Character.isLetter(charArray[i])) {
 
    //      // check space is present before the letter
    //      if(foundSpace) {
 
    //        // change the letter into uppercase
    //        charArray[i] = Character.toUpperCase(charArray[i]);
    //        foundSpace = false;
    //      }
    //    }
 
    //    else {
    //      // if the new character is not character
    //      foundSpace = true;
    //    }
    //  }
 
    //  // convert the char array to the string
    //  message = String.valueOf(charArray);
    //  System.out.println("Message: " + message);

    }
}

