//package  com.Bacchus.app.components;
//
//import java.io.Serializable;
//import java.util.List;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.WebApplicationContext;
//
///**
// * 雇用契約設定セッション用DTO。
// *
// * @author majo_k
// * $Id:$
// */
//@Service
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class SessionUserTDto implements Serializable {
//
//	   /** DTOリスト */
//    private List<UserTDto> userTDtoList;
//
//
//
//    /** serialVersionUID */
//    private static final long serialVersionUID = 1L;
//
//
//    /**
//     * DTOリストの取得。
//     *
//     * @return DTOリスト
//     */
//    public List<UserTDto> getUserTDtoList() {
//        return this.userTDtoList;
//    }
//
//    /**
//     * DTOリストを設定。
//     *
//     * @param empContractDtoList DTOリスト
//     */
//    public void setUserTDtoList(List<UserTDto> userTDtoList) {
//        this.userTDtoList = userTDtoList;
//    }
//
//
//}
