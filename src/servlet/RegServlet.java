package servlet;
import entity.Users;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JN on 2016/4/21.
 */
public class RegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        Users u = new Users();
        String username,mypassword,gender,email,introduce;
        Date birthday;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            username = request.getParameter("username");
            mypassword = request.getParameter("mypassword");
            gender = request.getParameter("gender");
            email = request.getParameter("email");
            introduce = request.getParameter("introduce");
            //用来获取多个复选框按钮的值
            birthday = sdf.parse(request.getParameter("birthday"));

            u.setUsername(username);
            u.setMypassword(mypassword);
            u.setGender(gender);
            u.setEmail(email);
            u.setIntroduce(introduce);
            u.setBirthday(birthday);


            //把注册成功的对象保存到session中
            request.getSession().setAttribute("regUser",u);
            //跳转到注册成功界面
            request.getRequestDispatcher("../userinfo.jsp").forward(request,response);


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }


    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
