import java.io.File;

public class ObserverFiles implements Runnable{
	
	protected File path;
	protected int count;

	public ObserverFiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ObserverFiles(File path) {
		super();
		this.path = path;
	}

	public ObserverFiles(File path, int count) {
		super();
		this.path = path;
		this.count = count;
	}

	public File getPath() {
		return path;
	}

	public void setPath(File path) {
		this.path = path;
	}

	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public int ViewCatalog (){
		count = 0;
		File [] files = path.listFiles();
		
		for (File file : files) {
			if(file.isFile()){
				count++;
			}
		}
		return count;
		
	}
	
	

	@Override
	public String toString() {
		return "ObserverFiles [path=" + path + "]";
	}

	@Override
	public void run() {
		int tmpCount = ViewCatalog();
		
		Thread th = Thread.currentThread();
		for (; !th.isInterrupted(); ) {
			System.out.println("Файлов в папке - " + ViewCatalog());
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			if (tmpCount < ViewCatalog()){	
				System.out.println(ViewCatalog() - tmpCount + " файл/ов добавлено");
				tmpCount = ViewCatalog();
			}
			else if (tmpCount > ViewCatalog()){	
				System.out.println(tmpCount - ViewCatalog() + " файл/ов удалено");
				tmpCount = ViewCatalog();
			}
		}
		
		
		
		
		
		
	}
	
	

}
