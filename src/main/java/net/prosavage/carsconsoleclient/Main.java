package net.prosavage.carsconsoleclient;

import com.mongodb.*;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      System.out.println("Connecting to the server....");
      try {
         MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://198.50.227.17:27017"));
         DB database = mongoClient.getDB("Test");
         DBCollection Accidents = database.getCollection("Accidents");
         DBCollection Hospitals = database.getCollection("Hospitals");
         Accidents.insert(new BasicDBObject("WOW", "INSANE"));


         mongoClient.close();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }


}
