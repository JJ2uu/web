package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_update2 {

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
		Bson set = Updates.set("name", "bb");
		Bson set2 = Updates.set("tel", "010");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		
		Bson setts = Updates.combine(list); // update는 무조건 (조건, Bson)이기 때문에 list를 다시 Bson으로 묶는다.
		
		collection.updateOne(filter, setts); // setts 자리는 무조건 Bson(json)이어야 함
		System.out.println("4. member 컬렉션 updateOne 성공");
	}

}
