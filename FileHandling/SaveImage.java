package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {
	public static void main(String[] args) throws IOException {
		String image = "C:\\Users\\UDAY SANKAR\\Downloads\\IMG_20250327_123706.jpg";
		Path path = Paths.get(image);
		byte[] byteArray = Files.readAllBytes(path);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\NewImage.jpg");
		fos.write(byteArray);
		System.out.println("image saved");
	}
}
