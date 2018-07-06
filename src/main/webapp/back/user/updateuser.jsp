<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
	String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/backstyle.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">表单</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>编辑用户信息</span></div>
    <form action="back/userServlet?method=update" method="post">
    	<input type="hidden" name="id"	value="${user.id}" />
    	<ul class="forminfo">
	    <li><label>用户名</label><input name="username" type="text" class="dfinput" value="${user.name}" /></li>
	    <li><label>密码</label><input name="password" type="text" class="dfinput" value="${user.password}" /></li>
	     <li><label>性别</label><select name="sex" class="dfinput">
	  <c:if test="${user.sex eq '男'}">
	  		<option value="null">请选择</option>
	    	<option value="男" selected="selected">男</option>
	    	<option value="女">女</option>
	   </c:if>
	    <c:if test="${user.sex eq '女'}">
	  		<option value="null">请选择</option>
	    	<option value="男">男</option>
	    	<option value="女" selected="selected">女</option>
	   </c:if>
	    </select>
	    </li>
	    
	     
	  	<li><label>角色</label><select name="isAdmin" class="dfinput">
	  		<c:if test="${user.isAdmin eq '是'}">
	  		<option value="null">请选择</option>
	    	<option value="是" selected="selected">管理员</option>
	    	<option value="否">普通用户</option>
	    	</c:if>
	    	<c:if test="${user.isAdmin eq '否'}">
	  		<option value="null">请选择</option>
	    	<option value="是">管理员</option>
	    	<option value="否" selected="selected">普通用户</option>
	    	</c:if>
	    </select>
	    </li>
	    
	    
	    
	    &nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
	    </ul>
    </form>
    </div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

