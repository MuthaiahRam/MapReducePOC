package com.cs267.assignmentPlayCards;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class PlayCardsMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	public void map(LongWritable key, Text value, Context con)
			throws IOException, InterruptedException {

		String line = value.toString();
		String deck[]=line.split(",");
		for(String card:deck){
			if(card.contains("J")||card.contains("K")||card.contains("Q")|card.contains("A")){
				continue;
			}
				Text outputKey = new Text(card.substring(0,1).trim());

				IntWritable outputValue = new IntWritable(1);

				con.write(outputKey, outputValue);

			
		}
	}
}


