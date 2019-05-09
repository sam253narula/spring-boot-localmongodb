package com.springboot.mongodb.example.springbootmongo;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

public class MongoConfig extends AbstractMongoConfiguration {
	@Override
	protected String getDatabaseName() {
		return "test";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("127.0.0.1", 27017);
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.springboot.mongodb.example.springbootmongo";
	}

}
