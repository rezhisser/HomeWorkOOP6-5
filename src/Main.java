import java.io.File;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 5) ���������� ��������� ������� � �������������� 1 ���,
����� ��������� ��������� ��������� ��������. ���� � ����
�������� ��������� ����� ���� ��� ��������, �� �������
��������� �� ���� �������. ��������� ������ �������� �
������������ ������ ����������
		 */
	
		File dir = new File(".");
		
		Thread ThreadOne = new Thread(new ObserverFiles(dir));
		ThreadOne.start();
		
	
		
	}

}
