package tech.swoven.strategy;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(List<File> listOfFiles) {
		System.out.println("Zip compressed files"+ listOfFiles.getClass().getName()+".zip");
	}

}
