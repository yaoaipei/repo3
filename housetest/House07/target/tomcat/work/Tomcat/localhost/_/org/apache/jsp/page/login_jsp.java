/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-07 11:14:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;utf-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<!-- saved from url=(0032)http://localhost:8080/HouseRent/ -->\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\"><HEAD><TITLE>青鸟租房 - 用户登录</TITLE>\r\n");
      out.write("<META content=\"text/html; charset=utf-8\" http-equiv=Content-Type><LINK \r\n");
      out.write("rel=stylesheet type=text/css href=\"../css/style.css\">\r\n");
      out.write("<META name=GENERATOR content=\"MSHTML 8.00.7601.17514\"></HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<DIV id=header class=wrap>\r\n");
      out.write("<DIV id=logo><IMG src=\"../images/logo.gif\"></DIV></DIV>\r\n");
      out.write("<DIV id=regLogin class=wrap>\r\n");
      out.write("<DIV class=dialog>\r\n");
      out.write("<DIV class=box>\r\n");
      out.write("<H4>用户登录</H4>\r\n");
      out.write("<FORM id=user method=post name=user action=\"loginAction\">\r\n");
      out.write("<DIV class=infos>\r\n");
      out.write("<TABLE class=field>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=2></TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD class=field>用 户 名：</TD>\r\n");
      out.write("    <TD><!-- <input type=\"text\" class=\"text\" name=\"name\" /> --><INPUT \r\n");
      out.write("      id=user_name class=text type=text name=name> </TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD class=field>密　　码：</TD>\r\n");
      out.write("    <TD><!-- <input type=\"password\" class=\"text\" name=\"password\" /> --><INPUT \r\n");
      out.write("      id=user_password class=text type=password name=password> </TD></TR><!--\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">验 证 码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text verycode\" name=\"veryCode\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t--></TBODY></TABLE>\r\n");
      out.write("<DIV class=buttons> <INPUT value=登陆 type=submit name=\"sub\"> <INPUT onclick='document.location=\"regs.htm\"' value=注册 type=button>\r\n");
      out.write("</DIV></DIV></FORM></DIV></DIV></DIV>\r\n");
      out.write("<DIV id=footer class=wrap>\r\n");
      out.write("<DL>\r\n");
      out.write("  <DT>青鸟租房 © 2018 北大青鸟 京ICP证1000001号</DT>\r\n");
      out.write("  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>\r\n");
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