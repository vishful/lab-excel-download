package model;

/*
//Progression -1 
//Create a class called ProGrad with the following parameters
//
//	private String name;
//	private String id;
//	private String rate;
//	private String comment;
//	private String recommend;
//	
//Generate getters and setters.
//Generate a constructor with the following parameters (String name, String id, String rate, String comment, String recommend)

*/


public class Prograd {
private String name;
private String id;
private String rate;
private String comment;
private String recommend;



public String getName() {
	return name;
}



public String getId() {
	return id;
}



public String getRate() {
	return rate;
}



public String getComment() {
	return comment;
}



public String getRecommend() {
	return recommend;
}



public void setName(String name) {
	this.name = name;
}



public void setId(String id) {
	this.id = id;
}



public void setRate(String rate) {
	this.rate = rate;
}



public void setComment(String comment) {
	this.comment = comment;
}



public void setRecommend(String recommend) {
	this.recommend = recommend;
}



public Prograd(String name, String id, String comment, String recommend) {
	this.name=name;
	this.id=id;
	this.rate=rate;
	this.comment=comment;
	this.recommend=recommend;
}












}