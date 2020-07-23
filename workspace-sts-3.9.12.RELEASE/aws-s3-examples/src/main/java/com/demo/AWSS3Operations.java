package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class AWSS3Operations {
	
	FileReader fileReader;
	Properties props;
	
	BasicAWSCredentials awsCredentials;
	AmazonS3 s3Client;
	
	public AWSS3Operations() {
		
		try {
			
			// READ PROPERTIES FILE FOR AWS IAM USER CREDENTIALS
			fileReader = new FileReader("src/main/resources/application.properties");
			props = new Properties();
			props.load(fileReader);
			
			// CONNECT TO AWS IAM USER
			awsCredentials = new BasicAWSCredentials(props.getProperty("accessKey"), props.getProperty("secretKey"));
			
			// CONNECT TO AWS S3
			s3Client = AmazonS3ClientBuilder.standard()
					.withRegion("us-east-1")
					.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
					.build();
			
			if(s3Client != null) {
				System.out.println("Connected to my S3!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void viewBuckets() throws SdkClientException, AmazonServiceException {
		
		List<Bucket> list = s3Client.listBuckets();
		System.out.println("My S3 Buckets:");
		for(Bucket buck : list) {
			System.out.println(buck.getName());
		}
	}
	
	public void createNewBucket(String bucketName) throws SdkClientException, AmazonServiceException {
		s3Client.createBucket(bucketName);
		System.out.println("Created a bucket! ");
		
	}
	
	public void uploadTextFileToBucket() throws SdkClientException, AmazonServiceException, FileNotFoundException {
		String bucketName = props.getProperty("targetBucket");
		String keyName = props.getProperty("keyName");
		String filePath = props.getProperty("filePath");
		System.out.println(filePath);
		
		// Upload a file as a new object with ContentType and title specified.
        PutObjectRequest request = new PutObjectRequest(bucketName, keyName, new File(filePath));
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType("plain/text"); // OPTIONAL Attribute
        metadata.addUserMetadata("title", "someTitle");
        request.setMetadata(metadata);
        s3Client.putObject(request);
		
		System.out.println("File Uploaded!");
	}
	
	public void readFileFromBucket() throws IOException {
		String bucketName = props.getProperty("targetBucket");
		String keyName = props.getProperty("keyName");
		
		S3Object object = s3Client.getObject(bucketName, keyName);
		if(object != null)
			System.out.println("File is found!");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(object.getObjectContent()));
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		
	}

	public static void main(String[] args) {
		
		try {
		
			AWSS3Operations ops = new AWSS3Operations();
			ops.viewBuckets();
			//ops.createNewBucket("nkpbucket0106");
			//ops.uploadTextFileToBucket();
			ops.readFileFromBucket();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
