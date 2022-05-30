/*
 * A NUMBER IS SAID TO BE NEON , IF SUM OF ALL THE DIGITS OF A NUMBER 
 * IS EQUAL TO THE SQUARE OF THAT DIGIT OR NUMBER .
 * EXAMPLE ---- INPUT 9 , OUTPUT 81 i. e . 8+1=9 . 
 */
class Neon 
    {
        public static void main(int n)
        {
            int p,store,rem,s=0;
           
           
                  p=n*n;
                  store=p;
                  while(store>0)
                  {
                      rem=store%10;
                      s=s+rem;
                      store=store/10;
                  }
                  if(s==n)
                  System.out.println("Neon Number");
                  else
                  System.out.println("Not Neon Number");
                }
                
            }
      
                  
                    
                  
                
