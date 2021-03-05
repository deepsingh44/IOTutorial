import java.io.File;
import java.io.IOException;
import java.util.Date;

public class First {
	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * File roots[] = File.listRoots(); for(File f:roots) { System.out.println(f); }
		 */

		/*
		 * File f=new File("C://"); File ff[]=f.listFiles(); for(File f1:ff) {
		 * //System.out.println(f1.isDirectory());
		 * //System.out.println(f1.getName()+"\t"+f1.isFile());
		 * //System.out.println(f1.isHidden()); }
		 */

		File folder = new File("e://demojava/deep/java");
		folder.mkdirs();
		File anotherfolder = new File(folder.getParentFile().getParentFile(), "php");
		anotherfolder.mkdir();
		// anotherfolder.delete();
		// anotherfolder.deleteOnExit();

		// System.out.println(anotherfolder.exists());
		// System.out.println(new Date(anotherfolder.lastModified()));
		// System.out.println(anotherfolder.canRead());
		// System.out.println(anotherfolder.canWrite());
		// System.out.println(anotherfolder.canExecute());

		// anotherfolder.setReadable(true);

		/*
		 * File file=new File(anotherfolder,"A.txt"); boolean
		 * status=file.createNewFile(); System.out.println(status);
		 */

		/*
		 * File ff=File.createTempFile("post", ".json");
		 * System.out.println(ff.getAbsoluteFile());
		 */

		File ff = File.createTempFile("post", ".json", anotherfolder);

	}
}
