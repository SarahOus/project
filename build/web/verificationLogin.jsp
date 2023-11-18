<%


String user = request.getParameter("user");
String pwd = request.getParameter("pwd");

if (user.equals("admin") && pwd.equals("admin")) {
     HttpSession s= request.getSession();
    s.setAttribute("user", user);
    s.setAttribute("pwd", pwd);

    response.sendRedirect("ajouterProduit.jsp");
} else {
 

    request.setAttribute("msg", "Erreur d'authentification");
    RequestDispatcher rd = request.getRequestDispatcher("loginn.jsp");
    rd.forward(request, response);
}
%>