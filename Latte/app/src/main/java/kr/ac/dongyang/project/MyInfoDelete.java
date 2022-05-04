package kr.ac.dongyang.project;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MyInfoDelete extends StringRequest {
    // 서버 url 설정 (php 파일 연동)
    final static private String URL = "http://122.32.165.55/MyDelete.php";
    private Map<String, String> map;

    public MyInfoDelete(String id, Response.Listener<String> listener ) {
        super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("id", id);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
