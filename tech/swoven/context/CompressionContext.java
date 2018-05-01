package tech.swoven.context;

import java.io.File;
import java.util.List;

import tech.swoven.strategy.CompressionStrategy;

public class CompressionContext {
	
	private CompressionStrategy compressionStrategy;
	
	public CompressionContext(CompressionStrategy strategy) {
		compressionStrategy = strategy;
	}
	
	public void compress(List<File> listOfFiles) {
		compressionStrategy.compress(listOfFiles);
	}

}
