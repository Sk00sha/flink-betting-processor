package sk00sha.flink;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import sk00sha.flink.testing.model.User;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws Exception{
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<User> stream = env.fromData(new User("weirdPaladin","weirdPaladin@gmail.com",  UUID.randomUUID().toString()));

        stream.print();
        env.execute();
    }
}