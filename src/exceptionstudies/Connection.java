package exceptionstudies;

public class Connection implements AutoCloseable {
	
	public Connection() {
		System.out.println("Open connection");
		//throw new IllegalStateException();
	}

	public void readingData() {
		System.out.println("Receinving data");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Close Connection");
	}
}
