class setBits{
 public static void main(String args[]){
             System.out.println(bits(15));
              }
static int bits(int N){
                                                            
int count=0;
 while(N>0){
        int set=N&1;
       if(set == 1){
              count++;
         }
         N=N>>1;
      }
                                                            
                                                            
      return count;
           }
}