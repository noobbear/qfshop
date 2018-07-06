package com.example.vo;

import java.util.Date;

public class Order {

	private Integer id;
	private String o_sendtype;
	private String o_paytype;
	private String o_paycount;
	private Date o_orderdate;
	private Integer userid;
	private String o_shperson;
	private String o_shphone;
	private String o_shaddress;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getO_sendtype() {
		return o_sendtype;
	}
	public void setO_sendtype(String o_sendtype) {
		this.o_sendtype = o_sendtype;
	}
	public String getO_paytype() {
		return o_paytype;
	}
	public void setO_paytype(String o_paytype) {
		this.o_paytype = o_paytype;
	}
	public String getO_paycount() {
		return o_paycount;
	}
	public void setO_paycount(String o_paycount) {
		this.o_paycount = o_paycount;
	}
	public Date getO_orderdate() {
		return o_orderdate;
	}
	public void setO_orderdate(Date o_orderdate) {
		this.o_orderdate = o_orderdate;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getO_shperson() {
		return o_shperson;
	}
	public void setO_shperson(String o_shperson) {
		this.o_shperson = o_shperson;
	}
	public String getO_shphone() {
		return o_shphone;
	}
	public void setO_shphone(String o_shphone) {
		this.o_shphone = o_shphone;
	}
	public String getO_shaddress() {
		return o_shaddress;
	}
	public void setO_shaddress(String o_shaddress) {
		this.o_shaddress = o_shaddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((o_orderdate == null) ? 0 : o_orderdate.hashCode());
		result = prime * result
				+ ((o_paycount == null) ? 0 : o_paycount.hashCode());
		result = prime * result
				+ ((o_paytype == null) ? 0 : o_paytype.hashCode());
		result = prime * result
				+ ((o_sendtype == null) ? 0 : o_sendtype.hashCode());
		result = prime * result
				+ ((o_shaddress == null) ? 0 : o_shaddress.hashCode());
		result = prime * result
				+ ((o_shperson == null) ? 0 : o_shperson.hashCode());
		result = prime * result
				+ ((o_shphone == null) ? 0 : o_shphone.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (o_orderdate == null) {
			if (other.o_orderdate != null)
				return false;
		} else if (!o_orderdate.equals(other.o_orderdate))
			return false;
		if (o_paycount == null) {
			if (other.o_paycount != null)
				return false;
		} else if (!o_paycount.equals(other.o_paycount))
			return false;
		if (o_paytype == null) {
			if (other.o_paytype != null)
				return false;
		} else if (!o_paytype.equals(other.o_paytype))
			return false;
		if (o_sendtype == null) {
			if (other.o_sendtype != null)
				return false;
		} else if (!o_sendtype.equals(other.o_sendtype))
			return false;
		if (o_shaddress == null) {
			if (other.o_shaddress != null)
				return false;
		} else if (!o_shaddress.equals(other.o_shaddress))
			return false;
		if (o_shperson == null) {
			if (other.o_shperson != null)
				return false;
		} else if (!o_shperson.equals(other.o_shperson))
			return false;
		if (o_shphone == null) {
			if (other.o_shphone != null)
				return false;
		} else if (!o_shphone.equals(other.o_shphone))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", o_sendtype=" + o_sendtype
				+ ", o_paytype=" + o_paytype + ", o_paycount=" + o_paycount
				+ ", o_orderdate=" + o_orderdate + ", userid=" + userid
				+ ", o_shperson=" + o_shperson + ", o_shphone=" + o_shphone
				+ ", o_shaddress=" + o_shaddress + "]";
	}

}
