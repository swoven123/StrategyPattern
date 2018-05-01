package tech.swoven.client;

import java.util.ArrayList;

import tech.swoven.context.CompressionContext;
import tech.swoven.strategy.CompressionStrategy;
import tech.swoven.strategy.ZipCompressionStrategy;

public class Client {

	public static void main(String[] args) {
		
		CompressionStrategy strategyZip = new ZipCompressionStrategy();
		CompressionContext context = new CompressionContext(strategyZip);
		context.compress(new ArrayList<>());
	}

}
