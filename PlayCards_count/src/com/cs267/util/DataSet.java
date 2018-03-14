package com.cs267.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataSet {

	public static void createDataset(String deckNumber) {

		String deck[] = { "hA", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9",
				"h10", "hJ", "hQ", "hK", "dA", "d2", "d3", "d4", "d5", "d6",
				"d7", "d8", "d9", "d10", "dJ", "dQ", "dK", "sA", "s2", "s3",
				"s4", "s5", "s6", "s7", "s8", "s9", "s10", "sJ", "sQ", "sK",
				"cA", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10",
				"cJ", "cQ", "cK" ,"J1","J2"};
		List<String> deckList = Arrays.asList(deck);
		try {
			File file = new File("input.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			for (int i = 0; i < Integer.valueOf(deckNumber); i++) {
				Collections.shuffle(deckList);
				// System.out.println(deckList.toString().replace("[","").replace("]",
				// "").trim());
				writer.append(deckList.toString().replace(" ", "")
						.replace("[", "").replace("]", "").trim());

				writer.append("\n");

			}
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
