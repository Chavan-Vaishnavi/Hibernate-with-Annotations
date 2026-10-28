package HibernatePractical2_Annotation.HibernatePractical2_Annotation.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales_info")
public class Sales {
	
	@Id
	@Column(name="Sales_id")
	private int sid;
	@Column(name="Sales_name")
	private String sname;
	@Column(name="Sales_dept")
	private String sdept;
	@Column(name="Sales_collection")
	private String scoll;
	
	@Override
	public String toString() {
		return "Sales [sid=" + sid + ", sname=" + sname + ", sdept=" + sdept + ", scoll=" + scoll + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getScoll() {
		return scoll;
	}
	public void setScoll(String scoll) {
		this.scoll = scoll;
	}
}
