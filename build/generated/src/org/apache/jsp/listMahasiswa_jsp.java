package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listMahasiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>\n");
      out.write("            Tugas_crud_672014094\n");
      out.write("        </title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <table border=1>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        NIM\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Nama\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Fakultas\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Jurusan\n");
      out.write("                    </th>\n");
      out.write("                    \n");
      out.write("                    <th colspan=2>\n");
      out.write("                        Action\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("            \n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"mahasiswa\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.nim}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.nama}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.fakultas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                        <!--<td><fmt:formatDate pattern=\"yyyy-MMM-dd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>-->\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.jurusan}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"ViewController?action=edit&nim=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.nim}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                Update\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                    \n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"ViewController?action=delete&nim=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mahasiswa.nim}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                Delete\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("                                \n");
      out.write("        <p><a href=\"UserController?action=insert\">Insert Mahasiswa</a></p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
