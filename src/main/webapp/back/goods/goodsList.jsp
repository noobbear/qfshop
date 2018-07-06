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
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/backstyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>

</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">数据表</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
        <li class="click"><a href="GoodsInfoServlet?method=queryType"><img src="images/t01.png" align="middle" />添加</a></li>
        <li class="click"><span><img src="images/t02.png" /></span>修改</li>
        <li><span><img src="images/t03.png" /></span>删除</li>
        <li><span><img src="images/t04.png" /></span>统计</li>
        </ul>
        
        
        <ul class="toolbar1">
        <li><span><img src="images/t05.png" /></span>设置</li>
        </ul>
    
    </div>
    <%-- <div style="margin-top: 5px;margin-bottom: 5px;">
    	<form action="back/McServlet?task=query" method="post">
    	<table class="tablelist"  >
    		<tr><td>所属大类&nbsp;&nbsp;<select onchange="changeSmallType(this.value,${listTypeCount });">
    					 <option value="-1">---请选择---</option>
    					 <c:forEach items="${listType }" var="big">
    					 	<c:if test="${big.fatherid eq '0' }">
    					 		<option value="${big.typeid }">${big.typename }</option>
    					 	</c:if>
    					 </c:forEach>
    				  </select>
    				  </td>
    				  <td>
    		    所属小类&nbsp;&nbsp;
    		    	<select id="smallType" >
    					 <option value="-1">---请选择---</option>
    				 </select>
    		  </td>
    		  <td>
    		 关键字:&nbsp;<input type="text" name="key" style="width:100px;height: 18px;"/>
    		 </td>
    		 <td>
    		 价格:<input type="text" name="beginPrice" style="width:100px;height: 18px;"/>
    		 &nbsp;至&nbsp;<input type="text" name="endPrice" style="width:100px;height: 18px;"/>
    		 &nbsp;&nbsp;<input  type="submit" value="提交"/>
    		 </td>
    		</tr>
    	</table>
    	</form>
    </div> --%>
    
    <table class="tablelist" >
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品描述</th>
        <th>商品图片</th>
        <th>单价</th>
        <th>操作</th>
       
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${queryGoodsInfolist}" var="good">
	        <tr>
	        <td><input name="" type="checkbox" value="" /></td>
	        <td>${good.id}</td>
	        <td>${good.goods_name}</td>
	        <td>${good.goods_description}==${good.goods_pic}</td>
	        <td align="center"><img src="images/${good.goods_pic}" style="width: 120px;height: 90px;" align="middle"/></td>
	        
	        <td>${good.goods_price}</td>
	        <td><a href="GoodsInfoServlet?method=queryGoodsInfoById&id=${good.id}"
			              class="tablelink">编辑</a>     
			        	<a href="javascript:#" 
				   onclick="if(confirm('是否确认删除')){location.href='GoodsInfoServlet?method=delete&id=${good.id}'};"
				class="tablelink"> 删除</a></td>
	        
	        </tr>
	        </c:forEach>
        </tbody>
    </table>
    
    
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
	
	
	
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
