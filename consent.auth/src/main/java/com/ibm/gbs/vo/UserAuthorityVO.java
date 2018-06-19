/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


public class UserAuthorityVO   {

	private int userId;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getAuthorityid() {
		return authorityid;
	}

	public void setAuthorityid(long authorityid) {
		this.authorityid = authorityid;
	}

	public long getUsrId() {
		return usrId;
	}

	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}

	private long authorityid;
	private long usrId;

	public UserAuthorityVO() {
	}

	public UserAuthorityVO(long usrId) {
		this.usrId = usrId;
	}

	

	
}
