import redis.clients.jedis.Jedis; 

public class RedisJava3{ 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("connect to server to get data: sucessfully"); 
      // Get the stored data and print it 
      System.out.println("Stored string in redis:: for key:varnan "+ jedis.get("varnan")); 
   } 
}