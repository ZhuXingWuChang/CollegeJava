package Stream;

import java.io.File;

public class UseFile {
	public static void main(String[] args) {
		File f = new File("d.java");
		//寻找该目录下的d.java文件，并把文件信息传给FileObject f
		//若d.java不存在，则f只是获得了一个虚拟的路径和程序中已经设定好的“d.java”文件名
		f.mkdir();
		//此时已经在该路径下创建了一个d.java！<文件夹>！
		System.out.println("文件对象是否存在? -->" + f.exists());
		System.out.println("文件对象是否可写? -->" + f.canWrite());
		System.out.println("文件对象是否可读? -->" + f.canRead());
		System.out.println("文件对象是否是文件? -->" + f.isFile());
		System.out.println("文件对象是否是目录? -->" + f.isDirectory());
		System.out.println("文件对象是否是绝对路径? -->" + f.isAbsolute());
		System.out.println("文件名是 -->" + f.getName());
		System.out.println("文件相对路径是 -->" + f.getPath());
		System.out.println("文件绝对路径是 -->" + f.getAbsolutePath());
		System.out.println("文件父路径是 -->" + f.getParent());
		System.out.println("文件长度是 -->" + f.length());
		
		File newfile = new File("newFile.java");
		f.renameTo(newfile);
		//将d.java文件夹重命名后，按照原本的程序，可以在src里面路径
		//结果newFile.java自动跑到了src的父路径
		System.out.println("\t重命名文件为: " + newfile.getName());
		System.out.println(f+"存在吗? -->" + f.exists());
		newfile.delete();
		System.out.println("删除 " + newfile + " ……");
		System.out.println(newfile+"存在吗? -->" + f.exists());
	}
}
