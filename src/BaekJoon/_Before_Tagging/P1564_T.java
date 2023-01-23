package BaekJoon._Before_Tagging;
import java.util.Scanner;

public class P1564_T {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      long n = sc.nextInt();
      String s = "1".replace("","");
      long result;
      int countZero; // 0�� ���� ���ϴ� ����
      
      for(int i = 2; i <= n; i++) {
         result = Long.parseLong(s) * i; // ���丮�� �� ���ϱ�
         s = Long.toString(result); // ���丮�� �� ���ڿ��� �����
         countZero = 0; // 0�� ���� ���ϴ� ���� �ʱ�ȭ
         for(int j = s.length() - 1; j >= 0; j--) {
            if(s.charAt(j) == '0'){ // �ڿ� ���ӵ� 0�� ���� ���ϱ�
               countZero++;
               continue;
            }
            
            s = s.substring(0, s.length() - countZero); // ó������ �ڿ��� 0�� ���� �������� �ڸ���
            break;
         }
         if(s.length()>12)
        	 s=s.substring(s.length()-12);
      }
      
      if(s.length() > 5) {
         s = s.substring(s.length() - 5, s.length());
      }
      
      System.out.println(s); // ���
      
      sc.close();
   }
}