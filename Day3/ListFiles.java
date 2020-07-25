import java.io.File;
import java.io.IOException;

public class ListFiles{
	public static void main(String[] args)
	{
		File fl = new File("D:\\IMCS_Training\\TestFolder");
		String all_files[] = fl.list();
		for (int i=0; i<all_files.length; i++)
		{
			System.out.println(all_files[i]);
		}
	}
}
