package practical_est;

public class HttpServlet {
    public void init() {
        System.out.println("Servlet is being initialized.");
    }
    public void service(){
        System.out.println("Servlet is servicing a request.");
    }
    public void destroy(){
        System.out.println("Servlet is being destroyed.");
    }
    public static void main(String[] args) {
        HttpServlet servlet = new HttpServlet();
        servlet.init();
        servlet.service();
        servlet.destroy();
    }
}
