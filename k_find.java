import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] test;	// �ӽ� �迭���� ��Ƶ� ������ �迭 ���� ����
        int a, b;	// �ݺ����� ����� ���� ����
        int s=0;	// �ӽù迭 �� ��ȣ�� �����ϱ� ���� ���� ����
        int i, j, k;	// commands �� ���Ҹ� �����ͼ� ��� ���� ���� ����

	// command �迭�� ���̸�ŭ �ݺ��� ����
        for(a=0 ; a<commands.length ; a++)
        {
            i = commands[a][0];		// commands �� a ��° �濡 �ִ� 0��° ����
            j = commands[a][1];		// commands �� a ��° �濡 �ִ� 1��° ����
            k = commands[a][2];		// commands �� a ��° �濡 �ִ� 2��° ����
            test = new int[j - i +1];	// test ��� �迭 ���� ������ �����ؿ��� �迭�� ũ�⸸ŭ ����
					// (�ܺ� �ݺ����� ����� ������ �ʱ�ȭ ��)

            // System.out.println(i + " " + j + " " + k);
	    // ������� i, j, k �� Ȯ��

	    // array �迭�� i ���� j ���� ���� ������� �ݺ��� ����
            for(b=i-1 ; b<j ; b++)
            {
                test[s] = array[b];	// test[0]...test[s]��  array[i]���� array[j]���� �� �����ͼ� ����
                s++;
            }
            s=0;

            Arrays.sort(test);	 	// �ӽ� �迭 �ʱ�ȭ

            answer[a] = test[k-1];	// answer �� test���� k ��° �ڸ��� �ִ� ���� �ִ´�.
        }

        return answer;

    }
}