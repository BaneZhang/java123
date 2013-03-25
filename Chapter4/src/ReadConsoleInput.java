import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadConsoleInput {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number:");
		int valueFromConsole = Integer.parseInt(reader.readLine());
		System.out.println("The number is:" + valueFromConsole);
	}
}