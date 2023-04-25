import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class GitHubAPITest {

    private final String API_URL = "newgwtrepo/.github/workflows/newget.yml";

    @Test
    void testGetRepo() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "My Java HTTP Client");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String owner = "octocat";
        String repo = "Hello-World";
        String endpoint = String.format("%s/repos/%s/%s", API_URL, owner, repo);

        ResponseEntity<String> response = restTemplate.exchange(
                endpoint,
                HttpMethod.GET,
                entity,
                String.class);

        assert(response.getStatusCode().is2xxSuccessful());
       
    }
}
