/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-12 06:39:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sp.springapp.domain.GalleryImg;
import org.sp.springapp.domain.Gallery;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/gallery/./inc/head_link.jsp", Long.valueOf(1694478716771L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.sp.springapp.domain.GalleryImg");
    _jspx_imports_classes.add("org.sp.springapp.domain.Gallery");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Gallery gallery = (Gallery)request.getAttribute("gallery");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select, textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 12px;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	margin-top: 6px;\r\n");
      out.write("	margin-bottom: 16px;\r\n");
      out.write("	resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button] {\r\n");
      out.write("	background-color: #04AA6D;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 12px 20px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button]:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function regist(){\r\n");
      out.write("	$(\"form\").attr({\r\n");
      out.write("		action:\"/gallery/regist\",\r\n");
      out.write("		method:\"post\",\r\n");
      out.write("		enctype:\"multipart/form-data\"\r\n");
      out.write("	});\r\n");
      out.write("	$(\"form\").submit();\r\n");
      out.write("}\r\n");
      out.write("$(function(){\r\n");
      out.write("	$(\"#bt_edit\").click(function(){\r\n");
      out.write("		if(confirm(\"수정하시겠어요?\")){\r\n");
      out.write("			$(\"form\").attr({\r\n");
      out.write("				action:\"/gallery/update\",\r\n");
      out.write("				method:\"post\",\r\n");
      out.write("				enctype:\"multipart/form-data\"\r\n");
      out.write("			});\r\n");
      out.write("			$(\"form\").submit();\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#bt_del\").click(function(){\r\n");
      out.write("		if(confirm(\"삭제하시겠어요?\")){\r\n");
      out.write("			//삭제요청시 form태그 안에 작성된 파라미터들을 한꺼번에 전송하자\r\n");
      out.write("			$(\"form\").attr({\r\n");
      out.write("				action:\"/gallery/delete\",\r\n");
      out.write("				method:\"post\"\r\n");
      out.write("			});\r\n");
      out.write("			$(\"form\").submit();\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#bt_list\").click(function(){\r\n");
      out.write("		location.href=\"/gallery/list\";\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<h3>상세보기</h3>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<form>\r\n");
      out.write("			<input type=\"hidden\" name=\"gallery_idx\" value=\"");
      out.print(gallery.getGallery_idx());
      out.write("\">\r\n");
      out.write("			<input type=\"text\" name=\"title\" value=\"");
      out.print(gallery.getTitle());
      out.write("\"> \r\n");
      out.write("			<input type=\"text\" name=\"writer\" value=\"");
      out.print(gallery.getWriter());
      out.write("\">\r\n");
      out.write("			<textarea id=\"content\" name=\"content\" style=\"height: 200px\">");
      out.print(gallery.getContent() );
      out.write("</textarea>\r\n");
      out.write("			");
for(int i=0;i<gallery.getGalleryImgList().size();i++){ 
      out.write("\r\n");
      out.write("			");
GalleryImg galleryImg=gallery.getGalleryImgList().get(i); 
      out.write("\r\n");
      out.write("			<input type=\"hidden\" name=\"filename\" value=\"");
      out.print(galleryImg.getFilename());
      out.write("\">\r\n");
      out.write("			<p>\r\n");
      out.write("				<img src=\"/static/data/");
      out.print(galleryImg.getFilename());
      out.write("\" width=\"150px\">\r\n");
      out.write("			</p>\r\n");
      out.write("			");
} 
      out.write("\r\n");
      out.write("			<input type=\"file\" id=\"lname\" name=\"photo\">\r\n");
      out.write("			<br>\r\n");
      out.write("			<input type=\"file\" id=\"lname\" name=\"photo\">\r\n");
      out.write("			<p>\r\n");
      out.write("			<input type=\"button\" value=\"수정\" id=\"bt_edit\">\r\n");
      out.write("			<input type=\"button\" value=\"삭제\" id=\"bt_del\">\r\n");
      out.write("			<input type=\"button\" value=\"목록\" id=\"bt_list\">\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
