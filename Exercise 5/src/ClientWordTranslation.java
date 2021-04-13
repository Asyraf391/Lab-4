import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


public class ClientWordTranslation {
	
	public static void main(String[] args) {
		
		try {
			
			// Connect to the server at localhost. port 4230
			Socket socket = new Socket (InetAddress.getLocalHost(), 4233);
			
			// Create input stream
			BufferedReader bufferedReader = new BufferedReader( new InputStreamReader (socket.getInputStream()));
			
			String text = bufferedReader.readLine();
			System.out.println(text);
			
		
			// Close everything
			bufferedReader.close();
			socket.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


