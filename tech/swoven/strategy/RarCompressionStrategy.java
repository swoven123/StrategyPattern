package tech.swoven.strategy;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(List<File> listOfFiles) {
		System.out.println("Rar compressed files"+ listOfFiles.getClass().getName()+ ".rar");
	}

}
