package LamdaTriggerS3;



public class HelloWorld implements RequestHandler <S3Event,String> {
	 @Override
	    public String handleRequest(S3Event event, Context ctx) {
	     S3EventNotifi.S3EventNotificationRecord record=event.getRecords().get(0);
	     System.out.println("Bucket Name is "+record.getS3().getBucket().getName());
	     System.out.println("File Path is "+record.getS3().getObject().getKey());
	     return null;
	    }
}
