package com.example.entity;

import java.util.Date;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_sendtype
     *
     * @mbggenerated
     */
    private String oSendtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_paytype
     *
     * @mbggenerated
     */
    private String oPaytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_paycount
     *
     * @mbggenerated
     */
    private Double oPaycount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_orderdate
     *
     * @mbggenerated
     */
    private Date oOrderdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_checkstate
     *
     * @mbggenerated
     */
    private Integer oCheckstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_checkdate
     *
     * @mbggenerated
     */
    private Date oCheckdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_checkperson
     *
     * @mbggenerated
     */
    private String oCheckperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.userid
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_shperson
     *
     * @mbggenerated
     */
    private String oShperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_shphone
     *
     * @mbggenerated
     */
    private String oShphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.o_shaddress
     *
     * @mbggenerated
     */
    private String oShaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_sendtype
     *
     * @return the value of t_order.o_sendtype
     *
     * @mbggenerated
     */
    public String getoSendtype() {
        return oSendtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_sendtype
     *
     * @param oSendtype the value for t_order.o_sendtype
     *
     * @mbggenerated
     */
    public void setoSendtype(String oSendtype) {
        this.oSendtype = oSendtype == null ? null : oSendtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_paytype
     *
     * @return the value of t_order.o_paytype
     *
     * @mbggenerated
     */
    public String getoPaytype() {
        return oPaytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_paytype
     *
     * @param oPaytype the value for t_order.o_paytype
     *
     * @mbggenerated
     */
    public void setoPaytype(String oPaytype) {
        this.oPaytype = oPaytype == null ? null : oPaytype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_paycount
     *
     * @return the value of t_order.o_paycount
     *
     * @mbggenerated
     */
    public Double getoPaycount() {
        return oPaycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_paycount
     *
     * @param oPaycount the value for t_order.o_paycount
     *
     * @mbggenerated
     */
    public void setoPaycount(Double oPaycount) {
        this.oPaycount = oPaycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_orderdate
     *
     * @return the value of t_order.o_orderdate
     *
     * @mbggenerated
     */
    public Date getoOrderdate() {
        return oOrderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_orderdate
     *
     * @param oOrderdate the value for t_order.o_orderdate
     *
     * @mbggenerated
     */
    public void setoOrderdate(Date oOrderdate) {
        this.oOrderdate = oOrderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_checkstate
     *
     * @return the value of t_order.o_checkstate
     *
     * @mbggenerated
     */
    public Integer getoCheckstate() {
        return oCheckstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_checkstate
     *
     * @param oCheckstate the value for t_order.o_checkstate
     *
     * @mbggenerated
     */
    public void setoCheckstate(Integer oCheckstate) {
        this.oCheckstate = oCheckstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_checkdate
     *
     * @return the value of t_order.o_checkdate
     *
     * @mbggenerated
     */
    public Date getoCheckdate() {
        return oCheckdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_checkdate
     *
     * @param oCheckdate the value for t_order.o_checkdate
     *
     * @mbggenerated
     */
    public void setoCheckdate(Date oCheckdate) {
        this.oCheckdate = oCheckdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_checkperson
     *
     * @return the value of t_order.o_checkperson
     *
     * @mbggenerated
     */
    public String getoCheckperson() {
        return oCheckperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_checkperson
     *
     * @param oCheckperson the value for t_order.o_checkperson
     *
     * @mbggenerated
     */
    public void setoCheckperson(String oCheckperson) {
        this.oCheckperson = oCheckperson == null ? null : oCheckperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.userid
     *
     * @return the value of t_order.userid
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.userid
     *
     * @param userid the value for t_order.userid
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_shperson
     *
     * @return the value of t_order.o_shperson
     *
     * @mbggenerated
     */
    public String getoShperson() {
        return oShperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_shperson
     *
     * @param oShperson the value for t_order.o_shperson
     *
     * @mbggenerated
     */
    public void setoShperson(String oShperson) {
        this.oShperson = oShperson == null ? null : oShperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_shphone
     *
     * @return the value of t_order.o_shphone
     *
     * @mbggenerated
     */
    public String getoShphone() {
        return oShphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_shphone
     *
     * @param oShphone the value for t_order.o_shphone
     *
     * @mbggenerated
     */
    public void setoShphone(String oShphone) {
        this.oShphone = oShphone == null ? null : oShphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.o_shaddress
     *
     * @return the value of t_order.o_shaddress
     *
     * @mbggenerated
     */
    public String getoShaddress() {
        return oShaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.o_shaddress
     *
     * @param oShaddress the value for t_order.o_shaddress
     *
     * @mbggenerated
     */
    public void setoShaddress(String oShaddress) {
        this.oShaddress = oShaddress == null ? null : oShaddress.trim();
    }

	@Override
	public String toString() {
		return "Order [id=" + id + ", oSendtype=" + oSendtype + ", oPaytype=" + oPaytype + ", oPaycount=" + oPaycount
				+ ", oOrderdate=" + oOrderdate + ", oCheckstate=" + oCheckstate + ", oCheckdate=" + oCheckdate
				+ ", oCheckperson=" + oCheckperson + ", userid=" + userid + ", oShperson=" + oShperson + ", oShphone="
				+ oShphone + ", oShaddress=" + oShaddress + "]";
	}

	public Order(Integer id, String oSendtype, String oPaytype, Double oPaycount, Date oOrderdate, Integer oCheckstate,
			Date oCheckdate, String oCheckperson, Integer userid, String oShperson, String oShphone,
			String oShaddress) {
		super();
		this.id = id;
		this.oSendtype = oSendtype;
		this.oPaytype = oPaytype;
		this.oPaycount = oPaycount;
		this.oOrderdate = oOrderdate;
		this.oCheckstate = oCheckstate;
		this.oCheckdate = oCheckdate;
		this.oCheckperson = oCheckperson;
		this.userid = userid;
		this.oShperson = oShperson;
		this.oShphone = oShphone;
		this.oShaddress = oShaddress;
	}

	public Order() {
		super();
	}
    
}