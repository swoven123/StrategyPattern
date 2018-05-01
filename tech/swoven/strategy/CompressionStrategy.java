package tech.swoven.strategy;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {
	
	public void compress(List<File> listOfFiles);
}
