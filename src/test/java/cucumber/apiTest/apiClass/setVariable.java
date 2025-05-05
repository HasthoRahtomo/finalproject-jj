package cucumber.apiTest.apiClass;

public class setVariable extends variable {

    public void setURL(String urlLinkValue){
        url = urlLinkValue;
    }

    public void setAPI(String apiLinkValue){
        apiUrl = apiLinkValue;
    }

    public void setPage(String pageValue){
        page = pageValue;
    }

    public void setLimit(String limitValue){
        limit = limitValue;
    }

    public void setAppId(String appIDValue){
        apiID = appIDValue;
    }

    public void setUserId(String userIdValue){
        userID = userIdValue;
    }

    public void setMethod(String methodValue){
        method = methodValue;
    }

    public void setFirstName(String firstNameValue){
        firstName = firstNameValue;
    }

    public void setLastName(String lastNameValue){
        lastName = lastNameValue;
    }

    public void setEmail(String emailValue) { email = emailValue; }
}
