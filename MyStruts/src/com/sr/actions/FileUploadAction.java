package com.sr.actions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport 

{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

   private File userImage;  
   public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

private String userImageContentType;  
   private String userImageFileName;  

	public String execute()
{

	        try 
	        {
	        	
	        	String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");            
	        	System.out.println("Image Location:" + filePath);  
	            File fileToCreate = new File(filePath,userImageFileName);
	            FileUtils.copyFile(userImage, fileToCreate);  
	              
	        }
	        
	        catch (Exception e)
	        {
				
	        	return "error";
			}
	        return "success";

}



}
