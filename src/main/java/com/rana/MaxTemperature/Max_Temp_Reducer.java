package com.rana.MaxTemperature;

import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Max_Temp_Reducer  extends MapReduceBase implements Reducer<Text,IntWritable,Text,IntWritable> {
    public void reduce(Text year, Iterator<IntWritable> values,OutputCollector<Text,IntWritable> output,
                       Reporter reporter) throws IOException {
    	
    	int maxTemp = Integer.MIN_VALUE;
    	
    	while(values.hasNext()) {
    		maxTemp = Math.max(maxTemp, values.next().get());
    	}
    	output.collect(year, new IntWritable(maxTemp));
    }
}