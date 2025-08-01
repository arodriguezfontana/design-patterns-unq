import java.util.List;

public class ApiFacebookAdapter implements ApiRedSocial {
    private ApiFacebook apiFacebook;

    @Override
    public List<String> seguidores(String userId) {
        return apiFacebook.friends(userId);
    }

    @Override
    public Integer posts(String userId) {
        return apiFacebook.status(userId).size();
    }
}
