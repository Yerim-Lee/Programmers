class Solution {
  public long solution(int a, int b) {
      long answer = 0;

      int i;
     
      // a ���� b �� �� ū ���
      if(a<b)
      {
           for(i=a ; i<=b ; i++) // ���� ������ ū������ �ݺ��� ����
               answer += i;	 // ���������� ū������ ������
      }
      
      // b ���� a �� �� ū ���
      if(a>b)
      {
          for(i=b ; i<=a ; i++)	// ���� ������ ū������ �ݺ��� ����
              answer += i;	// ���������� ū������ ������
      }
      
      // a �� b �� ���� ���
      if(a==b)
	  answer = a;	// �� ���� �ϳ��� �����ϱ� ����

      return answer;
  }
}