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
    
    <div class="formtitle"><span>修改商品信息</span></div>
    <form action="GoodsInfoServlet?method=update&id=${goodsInfo.id}" method="post" enctype="multipart/form-data">
    	<input type="hidden" name="id" value="${goodsInfo.id}"/>
    	<ul class="forminfo">
	    <li><label>商品名称</label><input name="goods_name" value="${goodsInfo.goods_name}"  type="text" class="dfinput" /><i>标题不能超过30个字符</i></li>
	    <li><label>所属大类</label>
	    		<select name="goods_parentid">
	    			<option value="0">无</option>
	    			<c:forEach items="${gtList}" var="big">
	    			<c:if test="${big.parentId eq 0}">
		    			<c:choose>
			    			<c:when test="${big.id eq goodsInfo.goods_parentid}">
			    			    <option value="${big.id}" selected="selected">${big.name}</option>
			    			</c:when>
			    			<c:otherwise>
			    			<option value="${big.id}">${big.name}</option>
			    			</c:otherwise>
		    			</c:choose>
	    			</c:if>
	    			</c:forEach>
	    		</select>
	    		
	    </i></li>
	    <li><label>所属小类</label>
	    	<select name="goods_fatherid">
	    		<option value="0">无</option>
	    		<c:forEach items="${gtList}" var="small">
	    		<c:if test="${small.parentId != '0'}">
	    			<c:choose>
	    			<c:when test="${small.id == goodsInfo.goods_fatherid}">
		    		<option value="${small.id}" selected="selected">${small.name}</option>
		    		</c:when>
		    		<c:otherwise>
		    		<option value="${small.id}">${small.name}</option>
		    		</c:otherwise>
		    		</c:choose>
	    		</c:if>
	    		</c:forEach>	
	    	</select>
	    </i></li>
	    <li><label>商品价格</label><input name="goods_price" type="text" class="dfinput" value="${goodsInfo.goods_price}"/><i>标题不能超过30个字符</i></li>
	    <li><label>商品图片</label><input name="goods_pic" type="file" value="${small.goods_pic}"/><i>标题不能超过30个字符</i></li>
	    <li><label>商品描述</label><textarea rows="8" cols="40" name="goods_description"  >${goodsInfo.goods_description}</textarea><i>标题不能超过30个字符</i></li>
	    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
	    </ul>
    
    </form>
    </div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

