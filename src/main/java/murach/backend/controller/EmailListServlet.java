package murach.backend.controller;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.backend.dao.UserDB;
import murach.backend.entity.User;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        String url = "/index.html";
        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dobString = request.getParameter("dateOfBirth");
            LocalDate dateOfBirth = null;
            if (dobString != null && !dobString.trim().isEmpty()) {
                try {
                    dateOfBirth = LocalDate.parse(dobString);
                } catch (Exception e) {
                    dateOfBirth = null;
                }
            }

            String heardFrom = request.getParameter("heardFrom");
            boolean wantsUpdates = request.getParameter("wantsUpdates") != null;
            boolean emailOK = request.getParameter("emailOK") != null;

            String[] contactByValues = request.getParameterValues("contactBy");
            String contactBy = (contactByValues != null) ? String.join(", ", contactByValues) : "";

            User user = new User(firstName, lastName, email, dateOfBirth, heardFrom, wantsUpdates, emailOK, contactBy);
            UserDB.insert(user);

            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }
}
