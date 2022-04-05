package control;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;

/**
 *
 * @author HuuTrinh
 */
@WebServlet(name = "CartController", urlPatterns = {"/cart"})
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        java.util.Enumeration em = session.getAttributeNames();
        ArrayList<Product> listCart = new ArrayList<>();
        //getList of cart
        int count = 0;
        while (em.hasMoreElements()) {
            String id = em.nextElement().toString();
            Object value = session.getAttribute(id);
            if (!id.equals("countCart") && !id.equals("user") && value != null) {
                Product pro = (Product) value;
                listCart.add(pro);
                count++;
            }
        }
        request.setAttribute("listCart", listCart);
        session.setAttribute("countCart", count);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getParameter("uri");
        String pid = request.getParameter("pid");
        ProductDAO dao = new ProductDAO();
        HttpSession session = request.getSession();
        if(session.getAttribute("countCart")==null){
            session.setAttribute("countCart", 1);
        }else{
            session.setAttribute("countCart", (int) session.getAttribute("countCart") + 1);
        }
        Product pro = (Product) session.getAttribute(pid);
        int Pquantity = Integer.parseInt(request.getParameter("Pquantity"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (pro == null) {
            pro = dao.getProductByID(pid);
            pro.setQuantity(quantity);
        } else {
            if (Pquantity - quantity <= 0) {

                response.sendRedirect(uri);
            } else {
                pro.setQuantity(pro.getQuantity() + 1);
            }
        }
        session.setAttribute(pid, pro);
        response.sendRedirect(uri);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
