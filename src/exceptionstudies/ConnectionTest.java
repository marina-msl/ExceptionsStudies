package exceptionstudies;

public class ConnectionTest {

	public static void main(String[] args) {
		
		// from Java 1.7
		
		try (Connection conn = new Connection()) {
			conn.readingData();
		} catch (IllegalStateException e1) {
			System.out.println("Connection Trouble");
		}
		
		// --> Legacy sistems
//		Connection conn = null;
//		try {
//			conn = new Connection();
//			conn.readingData();
//		} catch (IllegalStateException e) {
//			System.out.println("Connection Trouble");
//		} finally {
//			//Finally is always used, with or without exception
//			if (conn != null) {
//				conn.close();
//			}
//		}
	}
}
