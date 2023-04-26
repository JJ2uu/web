package com.multi.mongoDB;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_update {

	public static void main(String[] args) {
		/* 1. MongoDB 프로그램에 연결 */
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공");
		/* 2. shop2 DB로 연결 */
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공");
		/* 3. member 컬렉션에 연결 */
		MongoCollection<org.bson.Document> collection = database.getCollection("member");
		System.out.println("3. member 컬렉션에 연결 성공");
		
		Document filter = new Document();
		filter.append("id", "apple");
		
		/* update용 객체 bson(json) */
		Bson set = Updates.set("name", "aa");
		
		collection.updateOne(filter, set);
		System.out.println("4. member 컬렉션 updateOne 성공");
	}

}
