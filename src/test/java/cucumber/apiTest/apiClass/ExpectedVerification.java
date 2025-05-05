package cucumber.apiTest.apiClass;
import io.restassured.RestAssured;
import org.json.JSONObject;

import java.util.EmptyStackException;

public class ExpectedVerification extends SetVariable {
    private final SetVariable apiTaskSet;

    public ExpectedVerification(SetVariable apiTask) {
        apiTaskSet = apiTask;
    }

    public void expectedStatusCode(int statusCode){
        String method = apiTaskSet.getMethod().toLowerCase();

        if (method.equals("get") || method.equals("delete")) {
            RestAssured
                    .given()
                    .header("app-id", apiTaskSet.getApiID())
                    .when()
                    .get(apiTaskSet.getUrl() + apiTaskSet.getApiUrl() + apiTaskSet.getUserId() + apiTaskSet.getPage() + apiTaskSet.getLimit())
                    .then()
                    .log().all()
                    .assertThat().statusCode(statusCode);
        }

        else if(method.equals("post") || method.equals("put")){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("firstName", apiTaskSet.getFirstName());
            jsonObject.put("lastName", apiTaskSet.getLastName());
            if(method.equals("post")){
                jsonObject.put("email", apiTaskSet.getEmail());
            }

            RestAssured
                    .given().log().all()
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("app-id", apiTaskSet.getApiID())
                    .body(jsonObject.toString())
                    .request(method, (apiTaskSet.getUrl() + apiTaskSet.getApiUrl() + apiTaskSet.getUserId()))
                    .then()
                    .assertThat().statusCode(statusCode);
        }

        else{
            throw new EmptyStackException();
        }
    }
}
