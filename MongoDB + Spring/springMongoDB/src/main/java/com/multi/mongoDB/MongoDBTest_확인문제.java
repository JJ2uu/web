package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_확인문제 {

	public static void main(String[] args) {
		/* 1. MongoDB 프로그램에 연결 */
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공");
		/* 2. shop2 DB로 연결 */
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공");
		/* 3. member 컬렉션에 연결 */
		MongoCollection<org.bson.Document> collection = database.getCollection("memo");
		System.out.println("3. memo 컬렉션에 연결 성공");
		
		/*
		 *	1. shop2.memo에 연결하여 insertOne/insertMany
		 *		a. insertOne→age:500 name:song, office:busan, phone:011
		 *		b. insertMany→age:501, name:song2, office:busan, phone:011
		 *				     →age:502, name:song3, office:seoul, phone:011
		 *	                 →age:503, name:song4, office:busan, phone:011
		 *	                 
		 *	2. shop2.memo에 연결하여 deleteOne
		 *		a. age가 500인 document를 삭제
		 *		
		 *	3. shop2.memo에 연결하여 updateOne/updateMany
		 *		a. updateOne→age가 501인 document의 name:songsong으로 변경
		 *		b. updateMany→office가  busan인 document의 phone:9999, name: songsong2, age:555로 변경
		 */
		
		
		Document filter = new Document();
		filter.append("office", "busan");
	
		Bson set = Updates.set("phone", "9999");
		Bson set2 = Updates.set("name", "songsong2");
		Bson set3 = Updates.set("age", 555);

		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		list.add(set3);
		
		Bson setts = Updates.combine(list);
		
		collection.updateMany(filter, setts);
		System.out.println("Update 성공");
	}

}
