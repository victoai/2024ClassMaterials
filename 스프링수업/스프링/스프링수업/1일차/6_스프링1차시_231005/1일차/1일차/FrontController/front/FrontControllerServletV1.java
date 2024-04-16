package front;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "frontControllerServletV1", urlPatterns = "/front/members/*")
public class FrontControllerServletV1 extends HttpServlet {

    // URI 매핑정보와 Controller의 구현체를 저장
    private Map<String, ControllerV1> controllerMap = new HashMap<>();

    
    // URI에 따라 Controller의 구현체를 미리 생성
    public FrontControllerServletV1() { 
    	//url매핑에 해당하는 컨트롤 객체정보     	
        controllerMap.put("/frontPrj/front/members/new-form", new MemberFormControllerV1());
        controllerMap.put("/frontPrj/front/members/save", new MemberSaveControllerV1());
        controllerMap.put("/frontPrj/front/members", new MemberListControllerV1());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // URI 매핑정보 가져오기
        String requestURI = request.getRequestURI();         
        System.out.println( "requestURI:"  + requestURI);
        // 파싱된 URI와 적합한 구현체를 get, 꺼내기
        ControllerV1 controller = controllerMap.get(requestURI);
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        // 적합한 구현체의 메서드 호출
        controller.process(request, response);
    }
}