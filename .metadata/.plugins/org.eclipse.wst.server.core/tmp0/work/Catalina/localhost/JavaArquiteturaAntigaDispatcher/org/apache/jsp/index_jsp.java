/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-11 20:47:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"loginServlet\" method=\"get\">  \r\n");
      out.write("\t\tName:<input type=\"text\" name=\"userName\"/><br/>  \r\n");
      out.write("\t\tPassword:<input type=\"password\" name=\"userPass\"/><br/>  \r\n");
      out.write("\t\t<input type=\"submit\" value=\"login\"/>  \r\n");
      out.write("\t</form> \r\n");
      out.write("\t\r\n");
      out.write("\t<br><br><br>Método Post<br>\r\n");
      out.write("\t<form action=\"loginServlet\" method=\"post\">  \r\n");
      out.write("\t\tName:<input type=\"text\" name=\"userName\"/><br/>  \r\n");
      out.write("\t\tPassword:<input type=\"password\" name=\"userPass\"/><br/>  \r\n");
      out.write("\t\t<input type=\"submit\" name=\"submit\" value=\"login\"/>\r\n");
      out.write("\t\t<input type=\"submit\" name=\"submit\" value=\"create user\"/>   \r\n");
      out.write("\t</form> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br><br>AJAX<br>\r\n");
      out.write("\t<form >  \r\n");
      out.write("\t\tName:<input type=\"text\" name=\"userName\"/><br/>  \r\n");
      out.write("\t\tPassword:<input type=\"password\" name=\"userPass\"/><br/>  \r\n");
      out.write("\t\t<button id=\"requestAjax\">Chamar Controller</button>\r\n");
      out.write("\t</form> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("$(\"#requestAjax\").click(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t  type: \"POST\",\r\n");
      out.write("\t\t  url: \"http://localhost:8080/JavaArquiteturaAntigaDispatcher/loginAjax\",\r\n");
      out.write("//\t \t  data: {nome:\"Matheus\",email:\"matheus@teimoso.com\"},\r\n");
      out.write("\t\t  success:sucesso,\r\n");
      out.write("\t\t  error:erro,\r\n");
      out.write("// \t\t  dataType: 'json',\r\n");
      out.write("\t\t  contentType: \"application/json\",\r\n");
      out.write("\t\t  Accept : \"application/json\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function erro(status){\r\n");
      out.write("\tconsole.log(\"error\");\r\n");
      out.write("\tconsole.log(status);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function sucesso(data){\r\n");
      out.write("\tconsole.log(\"chamada com sucesso!!!\");\r\n");
      out.write("\tconsole.log(data);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
