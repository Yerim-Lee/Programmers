class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      int i;
      
      for(i=0; i<s.length(); i++)
      {
          if(s.length()!=4 || s.length()!=6)    // s�� ���̰� 4 �Ǵ� 6�� �ƴ϶��
          {
              answer = false;                   // false ó��
              break;
          }
          else                                    // s �� ���̰� 4 �Ǵ� 6�̶��
          {
              if((s.charAt(i)) < (char)48 || (s.charAt(i)) > (char)57)
              {
                  answer = false;
                  break;
              }
          }
      }
      return answer;
  }
}