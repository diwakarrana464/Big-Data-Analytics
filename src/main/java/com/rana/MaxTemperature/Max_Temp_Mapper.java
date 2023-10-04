package com.rana.MaxTemperature;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
public class Max_Temp_Mapper extends MapReduceBase implements Mapper<LongWritable,Text,Text,IntWritable>{
    
    public void map(LongWritable key, Text value,OutputCollector<Text,IntWritable> output,
                    Reporter reporter) throws IOException{
    	
        String line = value.toString();
        String[] arrayOfString = line.split(" ");
        String year = arrayOfString[0].substring(6,10);
        int temp = Integer.parseInt(arrayOfString[1].trim());
        
        output.collect(new Text(year), new IntWritable(temp));
    }
}