package info.wernke.criminal_intent;

import java.util.*;

public class Crime
{
	private UUID mId;
	private String mTitle;
	
	public UUID getmId(){
		return mId;
	}
	
	public void setTitle(String title){
		mTitle = title;
	}
	
	public String getTitle(){
		return mTitle;
	}
	
	public Crime(){
		mId = UUID.randomUUID();
	}
}
