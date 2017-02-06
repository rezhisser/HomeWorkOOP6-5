import java.io.File;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 5) Реализуйте программу которая с периодичностью 1 сек,
будет проверять состояние заданного каталога. Если в этом
каталоге появиться новый файл или исчезнет, то выведет
сообщение об этом событии. Программа должна работать в
параллельном потоке выполнения
		 */
	
		File dir = new File(".");
		
		Thread ThreadOne = new Thread(new ObserverFiles(dir));
		ThreadOne.start();
		
	
		
	}

}
