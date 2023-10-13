package webapp;

import webapp.Model.Point;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AreaCheckServlet extends HttpServlet {
    private Point point;
    private int radius;
    private HttpServletRequest request;
    private HttpServletResponse response;

    private PrintWriter out;
    public AreaCheckServlet(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public void validateFields(HttpServletRequest req) throws IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        setRadius(Integer.parseInt(req.getParameter("radius")));

        try{
            double pointX = Double.parseDouble(x);
            double pointY = Double.parseDouble(y);
            setPoint(new Point(pointX, pointY));


            // check x and y zone


            generateHTML(getResponse());
        } catch (NumberFormatException e) {
                out = getResponse().getWriter();
                out.println("<html> " +
                        "<head> " +
                        "</head> " +
                        "<body>" +
                        "<b>Поля формы не прошли валидацию</b> <a href='index.jsp'>Вернуться к форме</a>" +
                        "</body>" +
                        "</html>");
        }


    }

    private boolean checkRadiusArea(Point point){
        return true;
    }

    private void generateHTML(HttpServletResponse resp) throws IOException {
        PrintWriter outHTML = resp.getWriter();
        outHTML.println(
                "X=" + point.getX() +
                        "\nY=" + point.getY()
        );
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletResponse getResponse(){
        return response;
    }
}
