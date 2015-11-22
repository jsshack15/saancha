
package backend;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class RegisterAction extends ActionSupport implements ServletRequestAware , SessionAware{
    
    
    private String password;
    private String username;
    private String email;
    private String repassword;
HttpServletRequest request;
SessionMap<String,Object> sm;

    @Override
    public void validate() {
        if(username.equals("")){
            
            addFieldError("username", "Enter username");
        }
        if(password.equals("")){
          
            addFieldError("password", "Enter password");
        }
        if(password.equals("")){
          
            addFieldError("password", "Enter password");
        }
        if(email.equals("")){
          
            addFieldError("email", "Enter email");
        }
         
         if(password.equals(repassword))
         {
             
         }
         else{
            addFieldError("repassword", "Password not matched"); 
         }
    }

    @Override
    public String execute() throws Exception {
        Session s= HibernateUtil.getSessionFactory().openSession();
        Signup l= new Signup();
        l.setEmail(email);
        l.setPassword(password);
        l.setUsername(username);
        l.setRepassword(repassword);
        s.save(l);
        s.beginTransaction().commit();
        sm.put("id", l.getId());
        return SUCCESS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String rpassword) {
        this.repassword = repassword;
    }

    
    

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
    public SessionMap<String, Object> getSm() {
        return sm;
    }

    public void setSm(SessionMap<String, Object> sm) {
        this.sm = sm;
    }
    @Override
    public void setSession(Map<String, Object> map) {
    sm=(SessionMap<String, Object>) map;
    }
    
}
