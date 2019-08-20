import java.util.Scanner;
//수포자 뒤지라는 뜻
public class P1002_4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int testcase, x1, y1, r1, x2, y2, r2;
        double d, r;
        testcase = input.nextInt();
        int[] arr = new int[testcase];
        
        for(int i=0; i<testcase; i++)
        {
            x1 = input.nextInt();
            y1 = input.nextInt();
            r1 = input.nextInt();
            x2 = input.nextInt();
            y2 = input.nextInt();
            r2 = input.nextInt();
            
            d = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
            r = Math.sqrt(d);
           

            // 4번 
            if(x1 == x2 && y1 == y2 && r1 == r2)                                                            
            {
                arr[i] = -1;
            }

            //1, 2, 7번
            else if((x1 == x2 && y1 == y2 && r1 != r2) || (r > r1 + r2) || (r < Math.abs(r1-r2)))     
            {                                                                                                              
                arr[i] = 0;                                                                                                  
            }

            //3, 6번
            else if((r == r1 + r2) || Math.abs(r1-r2) == r)
            {
                arr[i] = 1;
            }

            //5번
            else
            {
                arr[i] = 2;
            }
        }
        
        for(int i=0; i<testcase; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}