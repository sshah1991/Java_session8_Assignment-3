
//Write a program for file copy
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) {

		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File srcfile = new File("Sourcefile.txt");
			File dstfile = new File("Destinationfile.txt");
			
			//Initiate Input Stream
			inStream = new FileInputStream(srcfile);
			//Initiate Output Stream
			outStream = new FileOutputStream(dstfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);//Read contents are copied to the out string

			}

			//Close Input Stream
			inStream.close();
			//Close Output Stream will write the file.
			outStream.close();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
