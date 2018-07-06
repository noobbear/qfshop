package com.qf.shop.servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.qf.shop.servce.impl.GoodTypeServletImpl;
import com.qf.shop.servce.impl.GoodsInfoServiceImpl;
import com.qf.shop.service.IGoodTypeService;
import com.qf.shop.service.IGoodsInfo;
import com.qf.shop.vo.GoodType;
import com.qf.shop.vo.GoodsInfo;

/**
 * Servlet implementation class GoodsInfoServlet
 */
public class GoodsInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private IGoodsInfo goodsInfoService = new GoodsInfoServiceImpl();
   private IGoodTypeService goodType = new GoodTypeServletImpl();
   private String uploadPath = "C:/java/workspace/test/shop_test/WebContent/images"; // 用于存放上传文件的目录
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		System.out.println("method:"+method);
		if("queryAllGoodsInfo".equals(method)){
			queryGoodsInfolist(request, response);
		}else if("queryType".equals(method)){
			List<GoodType> gtList = goodType.getGoodTypeList();
			request.setAttribute("gtList", gtList);
			request.getRequestDispatcher("/back/goods/goodsadd.jsp").forward(request, response);
		}else if("add".equals(method)){
			GoodsInfo gsInfo = new GoodsInfo();
			uploadFile2(request, gsInfo);
	        int result = goodsInfoService.addGoodsInfo(gsInfo);
			if(result > 0){
				queryGoodsInfolist(request,response);
			}
			
		}else if("queryGoodsInfoById".equals(method)){
			String id = request.getParameter("id");
			GoodsInfo goodsInfo = goodsInfoService.queryGoodById(Integer.parseInt(id));
			List<GoodType> gtList = goodType.getGoodTypeList();
			request.setAttribute("gtList", gtList);
			request.setAttribute("goodsInfo", goodsInfo);
			request.getRequestDispatcher("/back/goods/goodupdate.jsp").forward(request, response);
		}else if("update".equals(method)){
			GoodsInfo gsInfo = new GoodsInfo();
			uploadFile2(request, gsInfo);
			int result = goodsInfoService.updateGoodsInfo(gsInfo);
			if(result > 0){
				queryGoodsInfolist(request,response);
			}
		}else if("delete".equals(method)){
			String id = request.getParameter("id");
			int result = goodsInfoService.deleteGoodsInfo(Integer.parseInt(id));
			if(result > 0){
				queryGoodsInfolist(request,response);
			}
		}else if("queryAll".equals(method)){
			 List<GoodsInfo> allGoodsInfo = goodsInfoService.getAllGoodsInfo();
			List<GoodType> gtList = goodType.getGoodTypeList();
			request.setAttribute("gtList", gtList);
			request.setAttribute("giList", allGoodsInfo);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else if("queryById".equals(method)){
			String id = request.getParameter("id");
			GoodsInfo goodsInfo = goodsInfoService.queryGoodById(Integer.parseInt(id));
			String key = KeyOpetion.getKeyObject().createKey();
			request.setAttribute("goodsInfo", goodsInfo);
			request.setAttribute("key", key);
			request.getRequestDispatcher("/introduction.jsp").forward(request, response);
		}
	}

	private void queryGoodsInfolist(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<GoodsInfo> queryGoodsInfolist = goodsInfoService.queryGoodsInfo();
		request.setAttribute("queryGoodsInfolist", queryGoodsInfolist);
		request.getRequestDispatcher("/back/goods/goodsList.jsp").forward(request, response);
	}

	
	public void uploadFile2(HttpServletRequest req,GoodsInfo gsInfo){
		DiskFileItemFactory factory = new DiskFileItemFactory(); // 文件上传的工厂
		ServletFileUpload upload = new ServletFileUpload(factory); // 上传文件的核心类
		Map<String,String> map = new HashMap<String,String>();
		try {
			List itmes = upload.parseRequest(req); // 解析request
			Iterator iterator = itmes.iterator();
			while (iterator.hasNext()) {
				FileItem item = (FileItem)iterator.next();
				if(item.isFormField()){ // 判断是否有表单属性(非文件类型)
					System.out.println("name:"+item.getFieldName()+",vaule:"+item.getString("utf-8"));
					map.put(item.getFieldName(), item.getString("utf-8"));
				}else{
					String fileName =item.getName();
					gsInfo.setGoods_pic(fileName);
					if(fileName != null && !"".equals(fileName)){
						File file = new File(uploadPath+File.separatorChar+fileName); // 制定一个写入的文件
						item.write(file);  // 执行写入操作
					}
				}
			}
			BeanUtils.populate(gsInfo, map); // 把map中的数据映射到对象中
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
