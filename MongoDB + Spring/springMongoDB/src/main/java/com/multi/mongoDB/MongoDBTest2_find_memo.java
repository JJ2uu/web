package com.multi.mongoDB;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_find_memo {

	public static void main(String[] args) {
		/* 1. MongoDB 프로그램에 연결 */
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공");
		/* 2. shop2 DB로 연결 */
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공");
		/* 3. member 컬렉션에 연결 */
		MongoCollection<org.bson.Document> collection = database.getCollection("memo");
		System.out.println("3. member 컬렉션에 연결 성공");
		
		FindIterable<Document> list = collection.find();
		ArrayList<MemoVO> result = new ArrayList<MemoVO>();
		
		for (Document d : list) {
			System.out.println(d);
			MemoVO bag = new MemoVO();
			bag.setAge(d.getInteger("age"));
			bag.setName(d.getString("name"));
			bag.setOffice(d.getString("office"));
			bag.setPhone(d.getString("phone"));
			result.add(bag);
		}
		
		System.out.println(result);
		
	}

}
